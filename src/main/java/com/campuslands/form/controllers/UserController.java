package com.campuslands.form.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @GetMapping("/index")
    public String details(Model model) {
        model.addAttribute("title", "Bienvenido..");
        model.addAttribute("author", "sara lucia lozano rueda");
        model.addAttribute("web", "MiWeb");
        return "index";
    }
    
}
