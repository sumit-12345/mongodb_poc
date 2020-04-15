package com.test.mongodb.mongodb_poc.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter@ToString
public class Enrolment {
	@Id
	private ObjectId id;
	@Field(value = "enrolment_id")
	private int enrolmentId;
	@Field(value = "enrolment_resource_key")
	private String enrolmentResourceKey;
	private String status;
	@Field(value = "cancel_reason")
	private String cancelReason;
	@Field(value = "cancel_target")
	private String cancelTarget;
}
