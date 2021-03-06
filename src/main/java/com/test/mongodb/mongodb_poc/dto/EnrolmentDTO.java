package com.test.mongodb.mongodb_poc.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter@Getter
public class EnrolmentDTO {
	private int enrolmentId;
	private String status;
	private String cancelReason;
	private String cancelTarget;
	private List<PreferenceDTO> preferenceDTO;
}
