package com.test.OrderMongo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Order")
public record Order(
		@Id
		String order_id,
		String order_name,
		String location)
{}
