package com.test.OrderMongo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.OrderMongo.Entity.Order;
import com.test.OrderMongo.Repository.OrderRepository;
import com.test.OrderMongo.Service.OrderService;

@Service
public class ServiceImpl implements OrderService {
	
	@Autowired
	OrderRepository repo;

	public void setRepo(OrderRepository repo) {
		this.repo = repo;
	}

	@Override
	public Order createOrder(Order o) {
		return repo.save(o);
	}

	@Override
	public List<Order> readAllOrder() {
		return repo.findAll();
	}

	@Override
	public Order updateOrder(String id,Order o) {
		return repo.findById(id).
				map(
						odr -> repo.save(
								new Order(id,o.order_name(),o.location())
								)
					).orElseThrow(()->new RuntimeException("Order Not Found"));
		
	}


	@Override
	public void deleteOrder(String id) {
		repo.deleteById(id);
	}
	
	
	

}
