package com.krypton.webstore3.domain.repository;
import java.util.List;
import com.krypton.webstore3.domain.Product;
import java.util.Map;

public interface ProductRepository {
    List <Product> getAllProducts();
    void updateStock(String productId, long noOfUnits);
    List<Product> getProductsByFilter(Map<String,List<String>> filterParams);
    Product getProductById(String productID);
    void addProduct(Product product);
}