package com.devmvk.springpetclinic.controllers;

import com.devmvk.springpetclinic.services.FrGreetingServiceImpl;
import com.devmvk.springpetclinic.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterGreetingController {

    public static final String BEAN_CONTEXT_NAME = "setterGreetingController";

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier(FrGreetingServiceImpl.BEAN_CONTEXT_NAME) GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greetMe(){
        return greetingService.greet();
    }

}
