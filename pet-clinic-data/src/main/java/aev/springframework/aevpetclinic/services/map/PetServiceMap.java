package aev.springframework.aevpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import aev.springframework.aevpetclinic.model.Pet;
import aev.springframework.aevpetclinic.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Pet save(Pet object) {
		return super.save(object);
	}

	public Set<Pet> findAll() {
		return super.findAll();
	}

	public Pet findById(Long id) {
		return super.findById(id);
	}

	public void delete(Pet object) {
		this.delete(object);
	}

	public void deleteById(Long id) {
		this.deleteById(id);
	}

}
