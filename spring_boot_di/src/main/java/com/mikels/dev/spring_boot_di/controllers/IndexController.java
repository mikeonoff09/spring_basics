package com.mikels.dev.spring_boot_di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mikels.dev.spring_boot_di.models.services.IService;

@Controller
public class IndexController {

    // No need for anotation when pased through a constructor
    // It's a good practice to put it anyway
    // can also be injected in a setter
    @Autowired // Don't forget!!
    private IService myService;

    public IndexController(IService service) {
        this.myService = service;
    }

    @GetMapping({ "/index", "/", "" })
    public String index(Model model) {
        model.addAttribute("object", myService.operation());
        return "index";
    }
}
