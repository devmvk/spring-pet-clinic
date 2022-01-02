package com.devmvk.springpetclinic;

import com.devmvk.springpetclinic.controllers.ConstructGreetingController;
import com.devmvk.springpetclinic.controllers.HelloController;
import com.devmvk.springpetclinic.controllers.PropertyGreetingController;
import com.devmvk.springpetclinic.controllers.SetterGreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPetClinicApplication {

    public static void main(String[] args) {

       ApplicationContext ctx = SpringApplication.run(SpringPetClinicApplication.class, args);


        PropertyGreetingController propertyGreetingController = (PropertyGreetingController) ctx.getBean(PropertyGreetingController.BEAN_CONTEXT_NAME);
        SetterGreetingController setterGreetingController = (SetterGreetingController) ctx.getBean(SetterGreetingController.BEAN_CONTEXT_NAME);
        ConstructGreetingController constructGreetingController = (ConstructGreetingController) ctx.getBean(ConstructGreetingController.BEAN_CONTEXT_NAME);

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
