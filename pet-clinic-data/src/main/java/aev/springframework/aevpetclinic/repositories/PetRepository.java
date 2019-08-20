package aev.springframework.aevpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import aev.springframework.aevpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
