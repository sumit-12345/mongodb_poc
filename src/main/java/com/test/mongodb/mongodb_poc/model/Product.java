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
	@Field(name = "Name")
	private String name;
	@Field(name = "Brand")
	private String brand;
	@Field(name = "Model")
	private String model;
	@Field(name = "Colour")
	private String color;
	@Field(name = "Customer_Reviews")
	private String customer_reviews;
	@Field(name = "Date_first_available")
	private String date_of_frst_available;
}
