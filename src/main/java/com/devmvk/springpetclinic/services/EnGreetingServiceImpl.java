package com.devmvk.springpetclinic.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("default")
@Service
public class EnGreetingServiceImpl implements GreetingService {

    public static final String BEAN_CONTEXT_NAME = "enGreetingServiceImpl";

    @Override
    public String greet() {
        return "Hello";
    }
}
