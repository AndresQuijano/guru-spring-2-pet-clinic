package guru.springframework.guruspring2petclinic.repositories;

import guru.springframework.guruspring2petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
