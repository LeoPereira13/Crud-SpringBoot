package com.projetoTeste.CourseProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoTeste.CourseProject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
