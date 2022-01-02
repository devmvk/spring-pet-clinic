package com.devmvk.springpetclinic.controllers;

import com.devmvk.springpetclinic.services.EnGreetingServiceImpl;
import com.devmvk.springpetclinic.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructGreetingController {

    public static final String BEAN_CONTEXT_NAME = "constructGreetingController";
    
    private final GreetingService greetingService;

    public ConstructGreetingController(@Qualifier(EnGreetingServiceImpl.BEAN_CONTEXT_NAME) GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greetMe(){
        return greetingService.greet();
    }
}
