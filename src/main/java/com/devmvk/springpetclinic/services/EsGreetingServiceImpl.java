package com.devmvk.springpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public class EsGreetingServiceImpl implements GreetingService {

    public static final String BEAN_CONTEXT_NAME = "esGreetingServiceImpl";

    @Override
    public String greet() {
        return "Hola";
    }
}
