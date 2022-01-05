package com.devmvk.springpetclinic.models;

import com.devmvk.springpetclinic.entities.BaseEntity;

import java.time.LocalDate;

public class Pet extends BaseEntity {
    private final PetType petType;
    private Owner owner;
    private final LocalDate birthDate;

    public Pet(PetType petType, LocalDate birthDate) {
        this.petType = petType;
        this.birthDate = birthDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
