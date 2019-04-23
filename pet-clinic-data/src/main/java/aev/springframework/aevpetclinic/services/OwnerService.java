package aev.springframework.aevpetclinic.services;

import aev.springframework.aevpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);	

}
