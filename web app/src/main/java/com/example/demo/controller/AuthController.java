package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping({"/", "/login"})
    public String login(@org.springframework.web.bind.annotation.RequestParam(required = false) String error,
                        @org.springframework.web.bind.annotation.RequestParam(required = false) String logout,
                        Model model) {
        if (error != null) model.addAttribute("error", "1");
        if (logout != null) model.addAttribute("logout", "1");
        return "login";
    }


}

