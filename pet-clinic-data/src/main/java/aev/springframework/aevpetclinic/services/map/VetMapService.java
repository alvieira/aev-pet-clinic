package aev.springframework.aevpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import aev.springframework.aevpetclinic.model.Specialty;
import aev.springframework.aevpetclinic.model.Vet;
import aev.springframework.aevpetclinic.services.SpecialtyService;
import aev.springframework.aevpetclinic.services.VetService;

@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
	
	private final SpecialtyService specialtyService;

	public VetMapService(SpecialtyService specialtyService) {
		super();
		this.specialtyService = specialtyService;
	}

	@Override
	public Vet save(Vet object) {
		
		if (object.getSpecialties().size() > 0) {
			object.getSpecialties().forEach(specialty -> {
				if (specialty.getId() == null) {
					Specialty savedSpecialty = specialtyService.save(specialty);
					specialty.setId(savedSpecialty.getId());
				}
			});
		}
		
		return super.save(object);
	}

	public Set<Vet> findAll() {
		return super.findAll();
	}

	public Vet findById(Long id) {
		return super.findById(id);
	}

	public void delete(Vet object) {
		this.delete(object);
	}

	public void deleteById(Long id) {
		this.deleteById(id);
	}

}
