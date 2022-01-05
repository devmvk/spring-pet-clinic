package com.devmvk.springpetclinic.services;

import java.util.Set;

import com.devmvk.springpetclinic.models.Vet;

public interface VetService {
    
    
    Vet findById(Long id);
    Vet save(Vet owner);

    Set<Vet> findAll();
}
