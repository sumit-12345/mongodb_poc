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
@Getter@Setter
@ToString
public class Preference {
	@Id
	private ObjectId id;
	@Field(value = "preference_id")
	private int preferenceId;
	@Field(value = "enrolment_id")
	private int enrolmentId;
	private String status;
	@Field(value = "experience_id")
	private int experienceId;
	@Field(value = "experience_name")
	private String experienceName;
}
