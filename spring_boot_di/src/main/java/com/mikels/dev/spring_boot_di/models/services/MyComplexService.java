package com.mikels.dev.spring_boot_di.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
// @Service // same as component
@Component("myComplexService")
@Primary // allows us to select the default component to be injected
public class MyComplexService implements IService{

    @Override
    public String operation() {
        return "Executing some `complicated`  important operation...";
    }

}
