package com.mikels.dev.spring_boot_di.models.services;

import org.springframework.stereotype.Component;
// @Service
@Component
public class MyService {

    public String operation() {
        return "Executing some important operation...";
    }

}
