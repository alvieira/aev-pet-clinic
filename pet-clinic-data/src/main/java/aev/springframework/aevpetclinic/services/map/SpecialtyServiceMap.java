package aev.springframework.aevpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import aev.springframework.aevpetclinic.model.Specialty;
import aev.springframework.aevpetclinic.services.SpecialtiesService;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtiesService {

	@Override
	public Specialty save(Specialty object) {
		return super.save(object);
	}

	public Set<Specialty> findAll() {
		return super.findAll();
	}

	public Specialty findById(Long id) {
		return super.findById(id);
	}

	public void delete(Specialty object) {
		this.delete(object);
	}

	public void deleteById(Long id) {
		this.deleteById(id);
	}

}
