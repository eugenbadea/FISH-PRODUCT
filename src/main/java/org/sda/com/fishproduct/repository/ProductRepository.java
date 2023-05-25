package org.sda.com.fishproduct.repository;

import org.sda.com.fishproduct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
