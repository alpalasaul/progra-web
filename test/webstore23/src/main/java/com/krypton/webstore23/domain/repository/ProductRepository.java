package com.krypton.webstore23.domain.repository;

import java.util.List;
import com.krypton.webstore23.domain.Product;

public interface ProductRepository {

    List<Product> getAllProducts();

    void updateStock(String productId, long noOfUnits);
}
