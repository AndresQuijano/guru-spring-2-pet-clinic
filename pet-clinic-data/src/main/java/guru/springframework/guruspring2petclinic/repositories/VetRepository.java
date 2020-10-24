package guru.springframework.guruspring2petclinic.repositories;

import guru.springframework.guruspring2petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
