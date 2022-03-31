
package com.krypton.webstore3.service;

import com.krypton.webstore3.domain.Product;
import java.util.List;
import java.util.Map;


public interface ProductService {
    void updateAllStock();
    List<Product> getAllProducts();
    List<Product> getProductsByFilter(Map<String, List<String>> filterParams);
    Product getProductById(String productID);
    void addProduct(Product product);
}
