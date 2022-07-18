package com.aminterprise.mutlu.services;


import java.time.Instant;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.aminterprise.mutlu.dto.OrderDTO;
import com.aminterprise.mutlu.dto.OrderDTO;
import com.aminterprise.mutlu.entities.Order;
import com.aminterprise.mutlu.entities.Order;
import com.aminterprise.mutlu.entities.OrderStatus;
import com.aminterprise.mutlu.repositories.OrderRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTest {
	
	@Autowired
	private OrderService service;
	
	@Autowired
	private OrderRepository repository;
	
	@Test
	public void testFindAllOrders() {
		List<OrderDTO> list = service.findAll();
		assert(list.size() > 0);
	}
	
	@Test
	public void testInsertOrder() {
		OrderDTO order = new OrderDTO(null,	Instant.now(), 5, 10L, 500.00d,	OrderStatus.PENDING, new ArrayList<>());
		OrderDTO orderReturned = service.insert(order);
		repository.deleteById(orderReturned.getId());
		assert(orderReturned != null);	
	}
	
	@Test
	public void testUpdateOrder() {
		OrderDTO oldOrder = new OrderDTO(null,	Instant.now(), 5, 10L, 500.00d,	OrderStatus.PENDING, new ArrayList<>());
		
		OrderDTO oldOrderReturned = service.insert(oldOrder);
		oldOrderReturned.setQtd(50);		
		
		service.updateOrder(oldOrderReturned.getId(), oldOrderReturned);
		
		Order newOrder = repository.findById(oldOrderReturned.getId()).get();	
		
		repository.deleteById(newOrder.getId());
		
		assert(newOrder.getQtd() != oldOrder.getQtd());	
	}
	
	@Test
	public void testSetConclusedOrder() {
		OrderDTO oldOrder = new OrderDTO(null,	Instant.now(), 5, 10L, 500.00d,	OrderStatus.PENDING, new ArrayList<>());
		
		OrderDTO oldOrderReturned = service.insert(oldOrder);
		
		service.setConclused(oldOrderReturned.getId());
		
		Order newOrder = repository.findById(oldOrderReturned.getId()).get();	
		
		repository.deleteById(newOrder.getId());
		
		assert(newOrder.getStatus() != oldOrder.getStatus());	
	}
	
	@Test
	public void testSetPendingOrder() {
		OrderDTO oldOrder = new OrderDTO(null,	Instant.now(), 5, 10L, 500.00d,	OrderStatus.CONCLUSED, new ArrayList<>());
		
		OrderDTO oldOrderReturned = service.insert(oldOrder);
		
		service.setPending(oldOrderReturned.getId());
		
		Order newOrder = repository.findById(oldOrderReturned.getId()).get();	
		
		repository.deleteById(newOrder.getId());
		
		assert(newOrder.getStatus() != oldOrder.getStatus());	
	}	
	
}

















