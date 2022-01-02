package com.devmvk.springpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public class FrGreetingServiceImpl implements GreetingService {

    public static final String BEAN_CONTEXT_NAME = "frGreetingServiceImpl";

    @Override
    public String greet() {
        return "Bonjour";
    }
}
