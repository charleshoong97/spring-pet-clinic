package learning.charles.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import learning.charles.springpetclinic.model.Owner;
import learning.charles.springpetclinic.model.Vet;
import learning.charles.springpetclinic.service.OwnerService;
import learning.charles.springpetclinic.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstname("Charles");
		owner1.setLastname("Liao");

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstname("Jason");
		owner2.setLastname("Tan");

		ownerService.save(owner2);

		System.out.println("Loaded Owners...");

		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstname("Melvin");
		vet1.setLastname("Siok");

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstname("Jimm");
		vet2.setLastname("Soh");
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets...");
	}

}
