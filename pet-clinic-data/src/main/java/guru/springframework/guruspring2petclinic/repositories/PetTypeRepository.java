package guru.springframework.guruspring2petclinic.repositories;

import guru.springframework.guruspring2petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
