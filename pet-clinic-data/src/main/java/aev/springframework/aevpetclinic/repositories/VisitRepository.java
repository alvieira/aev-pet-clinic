package aev.springframework.aevpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import aev.springframework.aevpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
