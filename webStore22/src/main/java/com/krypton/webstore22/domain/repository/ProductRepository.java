package com.krypton.webstore22.domain.repository;
import java.util.List;
import com.krypton.webstore22.domain.Product;

public interface ProductRepository {
    List <Product> getAllProducts();
}