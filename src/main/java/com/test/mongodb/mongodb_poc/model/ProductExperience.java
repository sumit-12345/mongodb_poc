package com.test.mongodb.mongodb_poc.model;

import java.util.ArrayList;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection =  "product_experience")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductExperience {
	@Id
	private ObjectId id;
	@Field(value = "product_id")
	private int productId;
	@Field(value = "product_name")
	private String productName;
	private String status;
//	private Experience experience;
	private ArrayList<Experience> experience;
	
	
}
