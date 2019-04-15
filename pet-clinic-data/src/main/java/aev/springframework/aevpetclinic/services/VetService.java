package aev.springframework.aevpetclinic.services;

import java.util.Set;

import aev.springframework.aevpetclinic.model.Vet;

public interface VetService {
	
	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();

}
