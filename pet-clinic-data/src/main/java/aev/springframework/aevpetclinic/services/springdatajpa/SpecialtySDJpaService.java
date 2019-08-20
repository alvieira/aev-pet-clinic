package aev.springframework.aevpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import aev.springframework.aevpetclinic.model.Specialty;
import aev.springframework.aevpetclinic.repositories.SpecialtyRepository;
import aev.springframework.aevpetclinic.services.SpecialtyService;

@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialtyService {

	private final SpecialtyRepository specialtyRepository;

	public SpecialtySDJpaService(SpecialtyRepository specialtyRepository) {
		super();
		this.specialtyRepository = specialtyRepository;
	}

	@Override
	public Set<Specialty> findAll() {
		Set<Specialty> specialties = new HashSet<>();
		specialtyRepository.findAll().forEach(specialties::add);
		return specialties;
	}

	@Override
	public Specialty findById(Long id) {
		Optional<Specialty> optionalSpecialty = specialtyRepository.findById(id);

		if (optionalSpecialty.isPresent()) {
			return optionalSpecialty.get();
		} else {
			return null;
		}
	}

	@Override
	public Specialty save(Specialty object) {
		return specialtyRepository.save(object);
	}

	@Override
	public void delete(Specialty object) {
		specialtyRepository.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		specialtyRepository.deleteById(id);
	}

}
