package com.test.mongodb.mongodb_poc.model;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Document
public class Experience {
	@Id
	private ObjectId id;
	@Field(value = "experience_id")
	private int experienceId;
	@Field(value = "expreience_resource_key")
	private String experienceResourceKey;
	@Field(value = "experience_name")
	private String experienceName;
	private String model;
	@Field(value = "used_for")
	private String usedFor;
	private String type;
	@Field(value = "attribute")
	private ArrayList<Attributes> attributes;
}
