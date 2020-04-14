package com.test.mongodb.mongodb_poc.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document 
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter @Setter
public class Product {
	@Id
	private ObjectId id;
	@Field(value = "product_id")
	private int productId;
	private String name;
	private String model;
	@Field(value = "product_resource_key")
	private String productResourceKey;
}
