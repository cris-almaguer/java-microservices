package com.crispring.productmicroservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.crispring.productmicroservice.entity.ProductEntity;

public interface ProductRepository extends MongoRepository<ProductEntity, String>
{

}
