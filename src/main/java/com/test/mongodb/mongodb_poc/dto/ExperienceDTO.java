package com.test.mongodb.mongodb_poc.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor@Getter@Setter
public class ExperienceDTO {
	private int experienceId;
	private String experienceName;
	private String type;
	private List<AttributeDTO> attribures;
}
