package com.krypton.webstore23.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.krypton.webstore23.domain.Product;
import com.krypton.webstore23.domain.repository.ProductRepository;
import com.krypton.webstore23.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void updateAllStock() {
        List<Product> allProducts = productRepository.getAllProducts();
        allProducts.stream().filter(product -> (product.getUnitsInStock() < 500)).forEachOrdered(product -> {
            productRepository.updateStock(product.getProductId(), product.getUnitsInStock() + 1000);
        });
    }
}
