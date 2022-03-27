package com.bunyamintunc.labaratuvar.staj.controller;

import com.bunyamintunc.labaratuvar.staj.model.Laborant;
import com.bunyamintunc.labaratuvar.staj.service.LaborantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/laborant")
public class LaborantController {

    @Autowired
    LaborantService laborantService;

    @GetMapping("new")
    public String addLaborant(Laborant laborant){
        return "laborant-form";
    }

    @PostMapping("/addlaborant")
    public String addLaborant(@Valid Laborant laborant, BindingResult result, Model model){
        if(result.hasErrors()){
            return "laborant-form";
        }
        else{
            this.laborantService.add(laborant);
            return "redirect:/report/getall";
        }

    }

}
