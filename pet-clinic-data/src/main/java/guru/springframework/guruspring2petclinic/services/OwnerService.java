package guru.springframework.guruspring2petclinic.services;

import guru.springframework.guruspring2petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);

}
