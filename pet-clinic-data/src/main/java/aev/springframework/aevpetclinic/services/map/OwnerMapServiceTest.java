package aev.springframework.aevpetclinic.services.map;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import aev.springframework.aevpetclinic.model.Owner;

class OwnerMapServiceTest {

	OwnerMapService ownerMapService;

	final Long ownerId = 1L;
	final String lastName = "Smith";

	@BeforeEach
	void setUpBeforeClass() throws Exception {
		ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());

		ownerMapService.save(Owner.builder().id(ownerId).lastName(lastName).build());
	}

	@Test
	void testFindAll() {
		Set<Owner> ownerSet = ownerMapService.findAll();

		assertEquals(1, ownerSet.size());
	}

	@Test
	void testSaveOwnerExistingId() {
		Long id = 2L;
		Owner owner2 = Owner.builder().id(id).build();
		Owner savedOwner = ownerMapService.save(owner2);

		assertEquals(id, savedOwner.getId());
	}

	@Test
	void testSaveNoId() {
		Owner savedOwner = ownerMapService.save(Owner.builder().build());

		assertNotNull(savedOwner);
		assertNotNull(savedOwner.getId());
	}

	@Test
	void testFindByIdLong() {
		Owner owner = ownerMapService.findById(ownerId);

		assertEquals(ownerId, owner.getId());
	}

	@Test
	void deleteOwner() {
		ownerMapService.delete(ownerMapService.findById(ownerId));

		assertEquals(0, ownerMapService.findAll().size());
	}

	@Test
	void deleteOwnerById() {
		ownerMapService.deleteById(ownerId);

		assertEquals(0, ownerMapService.findAll().size());
	}

	@Test
	void testFindByLastName() {
		Owner smith = ownerMapService.findByLastName(lastName);

		assertNotNull(smith);
		assertEquals(ownerId, smith.getId());
	}

	@Test
	void testFindByLastNameNotFound() {
		Owner foo = ownerMapService.findByLastName("foo");

		assertNull(foo);
	}

}
