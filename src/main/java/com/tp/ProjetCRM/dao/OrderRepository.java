package com.tp.ProjetCRM.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tp.ProjetCRM.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
