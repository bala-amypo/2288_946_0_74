package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.dben;
@Repository
public interface dbrep extends JpaRepository<dben, Integer> {
    

}
