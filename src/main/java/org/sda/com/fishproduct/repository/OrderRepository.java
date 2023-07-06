package org.sda.com.fishproduct.repository;

import org.sda.com.fishproduct.model.Order;
import org.sda.com.fishproduct.model.Product;
import org.sda.com.fishproduct.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order,Integer> {
List<Order> findAllByUserProfile(UserProfile userProfile);
Optional<Order> findByIdAndUserProfile(int id,UserProfile userProfile);
}
