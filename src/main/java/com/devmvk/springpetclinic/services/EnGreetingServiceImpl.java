package com.devmvk.springpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public class EnGreetingServiceImpl implements GreetingService {

    public static final String BEAN_CONTEXT_NAME = "enGreetingServiceImpl";

    @Override
    public String greet() {
        return "Hello";
    }
}
