package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.dben;
import com.example.demo.service.dbser;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class dbcon {
    @Autowired
    dbser ds;
    @PostMapping("/dbtry")
    public dben postMethodName(@RequestBody dben dn) {
        return ds.saveEntity(dn);
    }
    @GetMapping("/fetchda")
    public List<dben> fetchdata() {
        return ds.getdata();
    }
    
}
