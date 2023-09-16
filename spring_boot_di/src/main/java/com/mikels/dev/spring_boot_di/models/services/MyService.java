package com.mikels.dev.spring_boot_di.models.services;

import org.springframework.stereotype.Component;
// @Service // same as component
@Component("mySimpleService")
public class MyService implements IService{

    @Override
    public String operation() {
        return "Executing some important operation...";
    }

}
