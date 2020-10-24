package guru.springframework.guruspring2petclinic.repositories;

import guru.springframework.guruspring2petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
