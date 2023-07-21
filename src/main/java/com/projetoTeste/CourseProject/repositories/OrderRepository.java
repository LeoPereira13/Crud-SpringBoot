package com.projetoTeste.CourseProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoTeste.CourseProject.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
