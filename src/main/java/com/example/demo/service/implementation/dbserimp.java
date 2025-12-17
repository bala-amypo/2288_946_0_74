package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.dbrep;
import com.example.demo.entity.dben;
import com.example.demo.service.dbser;

@Service
public class dbserimp implements dbser{
    @Autowired
    dbrep dr;
    @Override
    public dben saveEntity(dben dn) {
        return dr.save(dn);
    }
    @Override
    public List<dben> getdata() {
        return dr.findAll();
    }
}
