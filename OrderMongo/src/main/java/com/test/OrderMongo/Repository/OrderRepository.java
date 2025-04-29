package com.test.OrderMongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.test.OrderMongo.Entity.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String>  {

}
