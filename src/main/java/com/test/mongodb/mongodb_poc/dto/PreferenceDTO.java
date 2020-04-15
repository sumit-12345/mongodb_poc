package com.test.mongodb.mongodb_poc.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
public class PreferenceDTO {
	private int enrolmentId;
	private String status;
	private int experienceId;
	private String experienceName;
}
