package aev.springframework.aevpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import aev.springframework.aevpetclinic.model.Visit;
import aev.springframework.aevpetclinic.services.VisitService;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

	@Override
	public Visit save(Visit visit) {

		if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
				|| visit.getPet().getOwner().getId() == null) {
			throw new RuntimeException("Invalid Visit");
		}

		return super.save(visit);
	}

	public Set<Visit> findAll() {
		return super.findAll();
	}

	public Visit findById(Long id) {
		return super.findById(id);
	}

	public void delete(Visit visit) {
		super.delete(visit);
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
