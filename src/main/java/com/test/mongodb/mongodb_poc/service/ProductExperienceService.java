package com.test.mongodb.mongodb_poc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.mongodb.mongodb_poc.dto.AttributeDTO;
import com.test.mongodb.mongodb_poc.dto.ExperienceDTO;
import com.test.mongodb.mongodb_poc.dto.ProdctDTO;
import com.test.mongodb.mongodb_poc.dto.ProductExperienceDTO;
import com.test.mongodb.mongodb_poc.model.Attributes;
import com.test.mongodb.mongodb_poc.model.Experience;
import com.test.mongodb.mongodb_poc.model.ProductExperience;
import com.test.mongodb.mongodb_poc.repo.ProductExperienceRepository;

@Service
public class ProductExperienceService {
	
	@Autowired
	private ProductExperienceRepository productExperienceRepository;
	
	public List<ProductExperienceDTO> getProductExperiences() {
		List<ProductExperience> list =  productExperienceRepository.findAll();
		return getProductExperienceDTOFromProductExperieneModel(list);
	}
	
	/*
	 * This method converts the Model object to DTO(Data Transfer Object) objects
	 * If we directly send the Model object as a response, Internal datastrecture will be exposed to the end user.
	 * Thats why we are using DTO Design Pattern.
	 */
	private List<ProductExperienceDTO> getProductExperienceDTOFromProductExperieneModel(List<ProductExperience> productExperiences) {
		List<ProductExperienceDTO> productExperienceDTOs = new ArrayList<ProductExperienceDTO>();
		for(ProductExperience productExperience : productExperiences) {
			ProductExperienceDTO productExperienceDTO = new ProductExperienceDTO();
			List<ExperienceDTO> experienceDTOs = new ArrayList<>();
			for(Experience experience : productExperience.getExperience()) {
				ExperienceDTO experienceDTO = new ExperienceDTO();
				experienceDTO.setExperienceId(experience.getExperienceId());
				experienceDTO.setExperienceName(experience.getExperienceName());
				experienceDTO.setType(experience.getType());
				List<AttributeDTO> attributeDTOs = new ArrayList<>();
				for(Attributes attributes:experience.getAttributes()) {
					attributeDTOs.add(new AttributeDTO(attributes.getAttributeId(), attributes.getType()));
				}
				experienceDTO.setAttribures(attributeDTOs);
				experienceDTOs.add(experienceDTO);
			}
			productExperienceDTO.setProductId(productExperience.getProductId());
			productExperienceDTO.setProductName(productExperience.getProductName());
			productExperienceDTO.setExperiences(experienceDTOs);
			productExperienceDTOs.add(productExperienceDTO);
		}
		return productExperienceDTOs;
	}

}
