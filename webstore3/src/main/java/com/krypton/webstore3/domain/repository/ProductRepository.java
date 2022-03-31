package com.krypton.webstore3.domain.repository;
import java.util.List;
import com.krypton.webstore3.domain.Product;

public interface ProductRepository {
    List <Product> getAllProducts();
    void updateStock(String productId, long noOfUnits);
    List<Product> getProductsByCategory(String category);
}