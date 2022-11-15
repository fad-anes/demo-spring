package com.example.demo.repository;

import com.example.demo.model.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface empRepo extends JpaRepository<employee, Integer> {

}
