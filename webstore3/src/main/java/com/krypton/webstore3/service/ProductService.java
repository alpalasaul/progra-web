package com.krypton.webstore3.service;

import com.krypton.webstore3.domain.Product;
import java.util.List;

public interface ProductService {

    void updateAllStock();

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);
}
