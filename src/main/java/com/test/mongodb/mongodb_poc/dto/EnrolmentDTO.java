package com.test.mongodb.mongodb_poc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter@Getter
public class EnrolmentDTO {
	private int productId;
	private String productName;
	private String status;
	private String cancelReason;
	private String cancelTarget;
}
