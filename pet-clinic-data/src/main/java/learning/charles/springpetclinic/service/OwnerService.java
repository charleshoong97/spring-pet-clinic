package learning.charles.springpetclinic.service;

import java.util.Set;

import learning.charles.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
}
