package com.mikels.dev.spring_boot_di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mikels.dev.spring_boot_di.models.services.MyService;

@Controller
public class IndexController {

    @Autowired // Don't forget!!
    private MyService myService;

    @GetMapping({ "/index", "/", "" })
    public String index(Model model) {
        model.addAttribute("object", myService.operation());
        return "index"; 
    }
}
