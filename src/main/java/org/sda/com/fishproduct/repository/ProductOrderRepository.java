package org.sda.com.fishproduct.repository;

import org.sda.com.fishproduct.model.Product;
import org.sda.com.fishproduct.model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOrderRepository extends JpaRepository<ProductOrder,Integer> {

}
