package com.devmvk.springpetclinic.services;

import java.util.Set;

import com.devmvk.springpetclinic.models.Pet;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet owner);

    Set<Pet> findAll();
    
}
