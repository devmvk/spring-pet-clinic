package com.devmvk.springpetclinic.services.mapservice;

import com.devmvk.springpetclinic.models.Vet;
import com.devmvk.springpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet obj) {
        return super.save(obj);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet obj) {
        super.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
