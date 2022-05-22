package learning.charles.springpetclinic.service;

import java.util.Set;

import learning.charles.springpetclinic.model.Vet;

public interface VetService {
	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();
}
