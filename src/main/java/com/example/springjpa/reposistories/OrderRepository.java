package com.example.springjpa.reposistories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springjpa.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
