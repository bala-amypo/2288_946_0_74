package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.dben;
@repository
public interface dbrep extends JpaRepository<dben, Integer> {
    

}
