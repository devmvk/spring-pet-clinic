package com.devmvk.springpetclinic.models;

import com.devmvk.springpetclinic.entities.BaseEntity;

public class Person extends BaseEntity {

    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
