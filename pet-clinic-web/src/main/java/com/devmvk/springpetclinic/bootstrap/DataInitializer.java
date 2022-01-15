package com.devmvk.springpetclinic.bootstrap;

import com.devmvk.springpetclinic.models.Owner;
import com.devmvk.springpetclinic.models.Vet;
import com.devmvk.springpetclinic.services.OwnerService;
import com.devmvk.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer(OwnerService ownerService, VetService vetService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner("Varun", "madupu");
        ownerService.save(owner1);

        Owner owner2 = new Owner("Anand", "madupu");
        ownerService.save(owner2);

        Vet vet1 = new Vet("david", "ram");
        vetService.save(vet1);

        Vet vet2 = new Vet("Raheem", "ram");
        vetService.save(vet2);


    }
}
