package aev.springframework.aevpetclinic.services;

import java.util.Set;

import aev.springframework.aevpetclinic.model.Owner;

public interface OwnerService {

	Owner findByLastName(String lastName);

	Owner findById(Long id);

	Owner save(Owner owner);

	Set<Owner> findAll();

}
