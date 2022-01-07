package com.devmvk.springpetclinic.services;

import com.devmvk.springpetclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

    
}

