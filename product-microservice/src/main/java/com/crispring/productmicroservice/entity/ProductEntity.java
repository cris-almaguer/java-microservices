package com.crispring.productmicroservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value = "product")
@Data
@NoArgsConstructor
public class ProductEntity 
{
    @Id
    private String id;
    private String productName;
    private String productDescription;
    private Double unitPrice;
}
