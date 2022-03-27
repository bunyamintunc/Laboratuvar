package com.bunyamintunc.labaratuvar.staj.controller;


import com.bunyamintunc.labaratuvar.staj.model.Patient;

import com.bunyamintunc.labaratuvar.staj.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("/home")
    public String home(){
        return "home";
    }


    @GetMapping("/new")
    public String showAddForm(Model model){
         Patient pa = new Patient();
         model.addAttribute("patient",pa);
        return "patient-form";
    }
    @RequestMapping(value = "/addpatient", method = RequestMethod.POST)
    public String addPatient(@ModelAttribute("patient") Patient patient){

            this.patientService.add(patient) ;
            return "redirect:/report/getall";

    }

}
