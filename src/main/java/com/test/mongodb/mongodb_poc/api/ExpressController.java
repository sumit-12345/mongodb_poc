package com.test.mongodb.mongodb_poc.api;

import java.util.Arrays;
import java.util.List;import javax.management.Attribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.mongodb.mongodb_poc.dto.EnrolmentDTO;
import com.test.mongodb.mongodb_poc.dto.PreferenceDTO;
import com.test.mongodb.mongodb_poc.dto.ProductExperienceDTO;
import com.test.mongodb.mongodb_poc.model.Attributes;
import com.test.mongodb.mongodb_poc.model.Experience;
import com.test.mongodb.mongodb_poc.model.Preference;
import com.test.mongodb.mongodb_poc.model.Product;
import com.test.mongodb.mongodb_poc.model.ProductExperience;
import com.test.mongodb.mongodb_poc.repo.AttributesRepository;
import com.test.mongodb.mongodb_poc.repo.ExperienceRepository;
import com.test.mongodb.mongodb_poc.repo.ProductExperienceRepository;
import com.test.mongodb.mongodb_poc.repo.ProductRepository;
import com.test.mongodb.mongodb_poc.service.EntolmentService;
import com.test.mongodb.mongodb_poc.service.ProductExperienceService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ExpressController {
	
	private ProductRepository productRepository;
	private AttributesRepository attributesRepositories;
	private ExperienceRepository experienceRepository;
	private ProductExperienceService productExperienceService;
	private EntolmentService enrolmentService;

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
	
	@PostMapping("/opt-in/product-id/{product-id}")
	public String optIn(@PathVariable(name = "product-id") int productId, @RequestBody ProductExperienceDTO productExperienceDTO) {
	String result = "";
		try {
			boolean res = enrolmentService.enroleProduct(productExperienceDTO, productExperienceService.getProductExperiences());
			if(!res)
				throw new RuntimeException();
			result = "Successfully Enrolled";
		} catch (Exception e) {
			result = "Enrolment Unsuccessful.";
		}
	return result;
	}
	
	@GetMapping("/getEnrl")
	public List<EnrolmentDTO> getEnrolmentDTOs() {
		return enrolmentService.getEnrolments();
	}
	@GetMapping("/getPref")
	public List<PreferenceDTO> getPreferences() {
		return enrolmentService.getPreferenceDTOs();
	}
}
