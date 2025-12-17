package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.dben;

public interface dbser {

    dben saveEntity(dben dn);
    List<dben> getdata();
}
