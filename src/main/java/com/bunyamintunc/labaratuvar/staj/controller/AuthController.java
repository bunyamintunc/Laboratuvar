package com.bunyamintunc.labaratuvar.staj.controller;

import com.bunyamintunc.labaratuvar.staj.dto.UserLoginDto;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class AuthController {

    @GetMapping("/")
    public String login(Model model, @Param("username") String userName, @Param("password") String password){
        return  "login";
    }

    @PostMapping("/")
    public String showLoginForm(@ModelAttribute("loginForm")UserLoginDto userLoginDto,Model model){
          String userName = userLoginDto.getUserName();
          String password = userLoginDto.getPassword();

          if(password.equals("admin") && userName.equals("admin")){
              return "main-home";
          }
          return "/login";
    }



}
