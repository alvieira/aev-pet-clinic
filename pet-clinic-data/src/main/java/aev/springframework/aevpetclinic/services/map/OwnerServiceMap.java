package aev.springframework.aevpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import aev.springframework.aevpetclinic.model.Owner;
import aev.springframework.aevpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Owner save(Owner object) {
		return super.save(object);
	}

	public Set<Owner> findAll() {
		return super.findAll();
	}

	public Owner findById(Long id) {
		return super.findById(id);
	}

	public void delete(Owner object) {
		this.delete(object);
	}

	public void deleteById(Long id) {
		this.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
