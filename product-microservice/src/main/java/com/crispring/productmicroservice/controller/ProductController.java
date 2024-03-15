package com.crispring.productmicroservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.crispring.productmicroservice.entity.ProductEntity;
import com.crispring.productmicroservice.repository.ProductRepository;

@RestController
@RequestMapping(value = "api/products")
public class ProductController 
{
    @Autowired
    private ProductRepository productRepository;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> get()
    {
        return productRepository.findAll();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody ProductEntity productEntity)
    {
        productRepository.save(productEntity);
    }
}
