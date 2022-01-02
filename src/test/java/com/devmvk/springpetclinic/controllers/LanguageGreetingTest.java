package com.devmvk.springpetclinic.controllers;

import com.devmvk.springpetclinic.services.EnGreetingServiceImpl;
import com.devmvk.springpetclinic.services.EsGreetingServiceImpl;
import com.devmvk.springpetclinic.services.FrGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LanguageGreetingTest {

    PropertyGreetingController propertyGreetingController;
    SetterGreetingController setterGreetingController;
    ConstructGreetingController constructGreetingController;

    @BeforeEach
    void setUp() {
        propertyGreetingController = new PropertyGreetingController();
        propertyGreetingController.greetingService = new EnGreetingServiceImpl();

        setterGreetingController = new SetterGreetingController();
        setterGreetingController.setGreetingService(new EsGreetingServiceImpl());

        constructGreetingController = new ConstructGreetingController(new FrGreetingServiceImpl());
    }


    @Test
    void greetMe() {

        System.out.println("Property Greeting ---> En");
        System.out.println(propertyGreetingController.greetMe());
        System.out.println("**************************");
        System.out.println("Setter Greeting ---> Es");
        System.out.println(setterGreetingController.greetMe());
        System.out.println("**************************");
        System.out.println("Construct Greeting ---> Fr");
        System.out.println(constructGreetingController.greetMe());

    }
}