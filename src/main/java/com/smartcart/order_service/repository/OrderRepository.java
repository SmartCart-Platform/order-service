package com.smartcart.order_service.repository;


import com.smartcart.order_service.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}