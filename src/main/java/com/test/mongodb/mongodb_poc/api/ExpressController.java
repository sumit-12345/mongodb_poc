package com.test.mongodb.mongodb_poc.api;

import java.util.List;import javax.management.Attribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.mongodb.mongodb_poc.model.Attributes;
import com.test.mongodb.mongodb_poc.model.Experience;
import com.test.mongodb.mongodb_poc.model.Product;
import com.test.mongodb.mongodb_poc.repo.AttributesRepository;
import com.test.mongodb.mongodb_poc.repo.ProductRepository;

@RestController
public class ExpressController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private AttributesRepository attributesRepositories;
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<List<Product>> getAllProduct() {
		List<Product> productList = productRepository.findAll();
		System.err.println(productList);
		return ResponseEntity.ok(productList);
	}
	
	@PostMapping("/save")
	public String saveProduct() {
		attributesRepositories.save(new Attributes(10,"Sumit"));
		return "Saved !!";
	}
}
