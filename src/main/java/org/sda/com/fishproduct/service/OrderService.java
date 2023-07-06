package org.sda.com.fishproduct.service;

import org.sda.com.fishproduct.model.Order;
import org.sda.com.fishproduct.model.UserProfile;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> findAllByUserEmail(String email);
    List<Order> findAll();
    Optional<Order> findByIdAndUserProfile(int id, UserProfile userProfile);
    Optional<Order> findById(int id);
    void delete(Order order);
    void update(Order order);
}
