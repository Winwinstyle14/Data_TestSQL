package com.example.data_testsql.repositories;

import com.example.data_testsql.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReposi extends JpaRepository<Product,Integer> {
}
