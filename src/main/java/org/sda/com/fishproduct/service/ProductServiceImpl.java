package org.sda.com.fishproduct.service;

import org.sda.com.fishproduct.model.Product;
import org.sda.com.fishproduct.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
      return productRepository.findAll();
    }

    @Override
    public void create(Product product) {
        productRepository.save(product);
    }

    @Override
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }
}
