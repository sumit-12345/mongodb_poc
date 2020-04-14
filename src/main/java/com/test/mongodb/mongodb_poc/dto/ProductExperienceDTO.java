package com.test.mongodb.mongodb_poc.dto;

import java.util.List;import com.test.mongodb.mongodb_poc.model.Experience;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor@Getter@Setter
public class ProductExperienceDTO {
	private int productId;
	private String productName;
	private List<ExperienceDTO> experiences;
}
