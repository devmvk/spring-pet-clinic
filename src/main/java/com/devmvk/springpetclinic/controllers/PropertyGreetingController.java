package com.devmvk.springpetclinic.controllers;

import com.devmvk.springpetclinic.services.EsGreetingServiceImpl;
import com.devmvk.springpetclinic.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyGreetingController {
    public static final String BEAN_CONTEXT_NAME = "propertyGreetingController";

    @Qualifier(EsGreetingServiceImpl.BEAN_CONTEXT_NAME)
    @Autowired
    GreetingService greetingService;

    public String greetMe(){
       return greetingService.greet();
    }
}
