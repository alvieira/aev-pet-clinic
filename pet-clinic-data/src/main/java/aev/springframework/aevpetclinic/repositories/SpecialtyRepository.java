package aev.springframework.aevpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import aev.springframework.aevpetclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {

}
