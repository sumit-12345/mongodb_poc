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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Attributes {
	@Id
	private ObjectId id;
	@Field(value = "attribute_id")
	private int attributeId;
	@Field(value = "attribute_resource_key")
	private String attributeResourceKey;
	private String color;
	private String ratings;
	private String brand;
	private String type;
}
