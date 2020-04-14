package com.test.mongodb.mongodb_poc.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.test.mongodb.mongodb_poc.model.Attributes;
@Repository
public interface AttributesRepository extends MongoRepository<Attributes, Integer>{

}
