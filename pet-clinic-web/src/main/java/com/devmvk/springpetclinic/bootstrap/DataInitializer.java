package com.devmvk.springpetclinic.bootstrap;

import com.devmvk.springpetclinic.services.OwnerService;
import com.devmvk.springpetclinic.services.VetService;
import com.devmvk.springpetclinic.services.mapservice.OwnerMapService;
import com.devmvk.springpetclinic.services.mapservice.VetMapService;
import org.springframework.boot.CommandLineRunner;

public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer() {

        ownerService = new OwnerMapService();
        vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
