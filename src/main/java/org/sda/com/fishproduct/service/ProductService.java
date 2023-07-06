package org.sda.com.fishproduct.service;

import org.sda.com.fishproduct.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAll();
    void create(Product product);
    void updateProduct(int id,Product product);
    Optional<Product> findById(int id);
}
