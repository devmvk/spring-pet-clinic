package com.devmvk.springpetclinic.services.mapservice;

import com.devmvk.springpetclinic.entities.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){
        if(object != null){
            if(object.getId() == null){
                object.setId(getNextId());
            }
            return map.put(object.getId(), object);
        }else{
            throw new RuntimeException("Objects cannot be null");
        }
    }

    void deleteById(ID id){
         map.remove(id);
    }

    void delete(T obj){
        map.entrySet().removeIf(entry -> entry.getValue().equals(obj));
    }

    Long getNextId(){
        if(map.keySet().isEmpty()) {
            return 1L;
        }
        return Collections.max(map.keySet()) + 1;
    }
}
