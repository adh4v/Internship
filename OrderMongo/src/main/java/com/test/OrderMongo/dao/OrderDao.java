package com.test.OrderMongo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.OrderMongo.Entity.Order;
import com.test.OrderMongo.Service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderDao {
	@Autowired
	private OrderService service;
	
	@PostMapping
	("/create")
	public Order create(@RequestBody Order o)
	{
		return service.createOrder(o);
		
	}
	
	@GetMapping("/listAll")
	public List<Order> read() 
	{
		return service.readAllOrder();
	}
	
	@PutMapping("/update/{id}")
	public Order update(@PathVariable String id,@RequestBody Order o)
	{
		return service.updateOrder(id, o);	
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable String id)
	{
		service.deleteOrder(id);
		return "Order Deleted Successfully";
	}
	
	
}
