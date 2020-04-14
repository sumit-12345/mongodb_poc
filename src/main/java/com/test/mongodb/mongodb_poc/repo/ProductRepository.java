package com.test.mongodb.mongodb_poc.repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.test.mongodb.mongodb_poc.model.Product;
@Repository
public interface ProductRepository extends MongoRepository<Product, ObjectId>{

}
