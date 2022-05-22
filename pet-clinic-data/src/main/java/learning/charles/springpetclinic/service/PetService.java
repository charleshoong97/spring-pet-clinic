package learning.charles.springpetclinic.service;

import java.util.Set;

import learning.charles.springpetclinic.model.Pet;

public interface PetService {
	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();
}
