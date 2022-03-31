package com.krypton.webstore3.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.krypton.webstore3.domain.Product;
import com.krypton.webstore3.domain.repository.ProductRepository;
import com.krypton.webstore3.service.ProductService;
import java.util.Map;

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

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public List<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
        return productRepository.getProductsByFilter(filterParams);
    }

    @Override
    public Product getProductById(String productID) {
        return productRepository.getProductById(productID);
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

}
