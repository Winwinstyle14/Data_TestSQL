package com.example.data_testsql.service;

import com.example.data_testsql.model.Product;
import com.example.data_testsql.repositories.ProductReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImol implements  ProductService{
    @Autowired
    ProductReposi productReposi;
    @Override
    public List<Product> getAllProduct() {
        return productReposi.findAll();
    }
}
