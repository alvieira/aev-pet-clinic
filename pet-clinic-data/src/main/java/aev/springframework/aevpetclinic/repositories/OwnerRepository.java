package aev.springframework.aevpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import aev.springframework.aevpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
