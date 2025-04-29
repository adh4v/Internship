package com.test.OrderMongo.Service;

import java.util.List;

import com.test.OrderMongo.Entity.Order;

public interface OrderService {
	
	public Order createOrder(Order o);
	
	public List<Order> readAllOrder();
	
	public Order updateOrder(String id,Order o);
	
	public void deleteOrder(String id);

}
