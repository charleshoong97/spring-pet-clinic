package learning.charles.springpetclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import learning.charles.springpetclinic.model.Owner;
import learning.charles.springpetclinic.service.OwnerService;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return this.findAll().stream().filter(owner -> owner.getLastname().equalsIgnoreCase(lastName)).findFirst()
				.orElse(null);
	}

}
