package com.devmvk.springpetclinic.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    public String helloWorld(){
        return "Hello World!!!";
    }
}
