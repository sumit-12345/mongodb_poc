package com.test.mongodb.mongodb_poc.api;

import java.util.Arrays;
import java.util.List;import javax.management.Attribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.mongodb.mongodb_poc.dto.ProductExperienceDTO;
import com.test.mongodb.mongodb_poc.model.Attributes;
import com.test.mongodb.mongodb_poc.model.Experience;
import com.test.mongodb.mongodb_poc.model.Product;
import com.test.mongodb.mongodb_poc.model.ProductExperience;
import com.test.mongodb.mongodb_poc.repo.AttributesRepository;
import com.test.mongodb.mongodb_poc.repo.ExperienceRepository;
import com.test.mongodb.mongodb_poc.repo.ProductExperienceRepository;
import com.test.mongodb.mongodb_poc.repo.ProductRepository;
import com.test.mongodb.mongodb_poc.service.ProductExperienceService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ExpressController {
	
	private ProductRepository productRepository;
	private AttributesRepository attributesRepositories;
	private ExperienceRepository experienceRepository;
	private ProductExperienceService productExperienceService;

	@GetMapping("/getAllProds")
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	@GetMapping("/allAttr")
	public List<Attributes> getAllAttributes() {
		return attributesRepositories.findAll();
	}
	
	@GetMapping("/allExp")
	public List<Experience> getAllExperience() {
		return experienceRepository.findAll();
	}
	
	@GetMapping("/getProdExp")
	public List<ProductExperienceDTO> getProductExperiences() {
		return productExperienceService.getProductExperiences();
	}
}
