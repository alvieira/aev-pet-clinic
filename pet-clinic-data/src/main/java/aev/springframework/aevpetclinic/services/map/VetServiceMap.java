package aev.springframework.aevpetclinic.services.map;

import java.util.Set;

import aev.springframework.aevpetclinic.model.Vet;
import aev.springframework.aevpetclinic.services.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
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
