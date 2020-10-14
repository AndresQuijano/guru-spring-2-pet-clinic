package guru.springframework.guruspring2petclinic.services;

import guru.springframework.guruspring2petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
