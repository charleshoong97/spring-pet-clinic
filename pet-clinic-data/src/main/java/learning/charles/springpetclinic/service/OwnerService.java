package learning.charles.springpetclinic.service;

import java.util.Set;

import learning.charles.springpetclinic.model.Owner;

public interface OwnerService {
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
