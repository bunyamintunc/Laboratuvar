package com.bunyamintunc.labaratuvar.staj.service;


import com.bunyamintunc.labaratuvar.staj.model.Laborant;
import com.bunyamintunc.labaratuvar.staj.repository.LaborantRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LaborantService {

    @Autowired
    LaborantRepositroy laborantRepositroy;

    public Laborant add(Laborant laborant){
        return this.laborantRepositroy.save(laborant);
    }

    public Laborant getById(Long laborantId){
        return this.laborantRepositroy.getById(laborantId);
    }
}
