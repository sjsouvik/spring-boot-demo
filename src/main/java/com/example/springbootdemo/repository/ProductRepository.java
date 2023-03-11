package com.example.springbootdemo.repository;

import com.example.springbootdemo.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {

}
