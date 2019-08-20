package aev.springframework.aevpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import aev.springframework.aevpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
