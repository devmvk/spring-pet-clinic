package com.devmvk.springpetclinic;

import com.devmvk.springpetclinic.config.ApplicationEnvironmentConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPetClinicApplication {

    public static void main(String[] args) {
       ApplicationContext ctx = SpringApplication.run(SpringPetClinicApplication.class, args);

        ApplicationEnvironmentConfig applicationEnvironmentConfig = ctx.getBean(ApplicationEnvironmentConfig.class);

        System.out.println("DB Username " + applicationEnvironmentConfig.getDbUserName());
        System.out.println("DB Password " + applicationEnvironmentConfig.getDbPassword());
        System.out.println("DB Jdbc Url " + applicationEnvironmentConfig.getJdbcUrl());
    }

}
