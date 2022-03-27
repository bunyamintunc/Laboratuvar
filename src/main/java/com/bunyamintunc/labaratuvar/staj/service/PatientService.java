package com.bunyamintunc.labaratuvar.staj.service;

import com.bunyamintunc.labaratuvar.staj.model.Patient;
import com.bunyamintunc.labaratuvar.staj.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient add(Patient patient){
        return this.patientRepository.save(patient);
    }

    public Patient getById(Long patientId){
        return  this.patientRepository.getById(patientId);
    }
}
