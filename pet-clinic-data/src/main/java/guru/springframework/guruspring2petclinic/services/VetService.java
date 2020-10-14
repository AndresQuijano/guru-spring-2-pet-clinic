package guru.springframework.guruspring2petclinic.services;

import guru.springframework.guruspring2petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
