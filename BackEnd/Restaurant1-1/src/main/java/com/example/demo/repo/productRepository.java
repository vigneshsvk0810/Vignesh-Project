package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Product;



public interface productRepository extends JpaRepository<Product,Long>
{

}
