package com.tp.ProjetCRM.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp.ProjetCRM.model.Order;
import com.tp.ProjetCRM.service.OrderDirectory;

@RestController
@RequestMapping("api")
public class OrderController {
	@Autowired
	private OrderDirectory orderDirectory;

	@GetMapping("orders")
	public List<Order> getOrders() {
		return orderDirectory.getOrders();
	}

	@GetMapping("orders/{id}")
	public ResponseEntity<Order> getOrder(@PathVariable("id") Integer id) {
		Optional<Order> optionalOrder = orderDirectory.getOrder(id);
		if (optionalOrder.isEmpty()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(optionalOrder.get());
		}
	}

	@PostMapping("orders")
	public Order postOrder(@RequestBody Order newOrder) {
		orderDirectory.addOrder(newOrder);
		return newOrder;
	}

	@DeleteMapping("orders/{id}")
	public void deleteOrder(@PathVariable("id") Integer id) {
		orderDirectory.deleteOrder(id);
	}

	@PutMapping("orders/{id}")
	public ResponseEntity updateOrder(@RequestBody Order order, @PathVariable("id") Integer id) {

		if (id != order.getId()) {
			return ResponseEntity.badRequest().build();
		} else {

			orderDirectory.updateOrder(order, id);
			return ResponseEntity.ok().build();
		}
	}

	@PatchMapping("orders/{id}")
	public void patchOrder(@RequestBody Order order, @PathVariable("id") Integer id) {
		System.out.println(order);
		orderDirectory.patchOrder(order, id);
	}
}
