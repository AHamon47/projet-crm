package com.tp.ProjetCRM.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tp.ProjetCRM.dao.OrderRepository;
import com.tp.ProjetCRM.model.Order;

@Service
public class OrderDirectory {
	@Autowired
	private OrderRepository orderRepository;
	
	public void addOrder(Order newOrder) {

		orderRepository.save(newOrder);
	}
	
	public List<Order> getOrders(){
		return orderRepository.findAll();
	}

	public Optional<Order> getOrder(Integer id) {
		return orderRepository.findById(id);
	}

	public void deleteOrder(Integer id){
		orderRepository.deleteById(id);
	}

	public void updateOrder(Order orderToUpdate, Integer id){
		orderRepository.save(orderToUpdate);
	}

	public void patchOrder(Order orderToUpdate, Integer id){
		Optional<Order> op = orderRepository.findById(id);
		if(op.isPresent()){
			Order order = op.get();
			order.patch(orderToUpdate);
			orderRepository.save(order);
		}
	}
}
