package guru.springframework.guruspring2petclinic.repositories;

import guru.springframework.guruspring2petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
