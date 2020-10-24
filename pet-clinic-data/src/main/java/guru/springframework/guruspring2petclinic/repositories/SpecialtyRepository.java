package guru.springframework.guruspring2petclinic.repositories;

import guru.springframework.guruspring2petclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
