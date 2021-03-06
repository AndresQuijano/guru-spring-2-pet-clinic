package guru.springframework.guruspring2petclinic.services.map;

import guru.springframework.guruspring2petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {
    protected Map<Long,T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){
        if(object!=null){
            if(object.getId()== null){
                object.setId(getNexId());
            }
            map.put(object.getId(),object);
        }else{
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNexId(){
        long nextId;

        try{
            nextId=Collections.max(map.keySet())+1;
        }catch(NoSuchElementException e){
            nextId=1L;
        }
        return nextId;
    }
}
