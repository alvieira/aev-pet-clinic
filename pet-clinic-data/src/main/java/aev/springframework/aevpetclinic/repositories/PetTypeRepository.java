package aev.springframework.aevpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import aev.springframework.aevpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
