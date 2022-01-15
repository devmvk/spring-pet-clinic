package com.devmvk.springpetclinic.services.mapservice;

import com.devmvk.springpetclinic.models.Owner;
import com.devmvk.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner obj) {
        return super.save(obj);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner obj) {
        super.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
