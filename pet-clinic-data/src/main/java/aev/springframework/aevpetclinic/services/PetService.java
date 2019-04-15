package aev.springframework.aevpetclinic.services;

import java.util.Set;

import aev.springframework.aevpetclinic.model.Pet;

public interface PetService {
	
	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();

}
