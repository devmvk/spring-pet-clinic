package com.devmvk.springpetclinic.models;

import com.devmvk.springpetclinic.entities.BaseEntity;

public class PetType extends BaseEntity {
    private final String name;

    public PetType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
