package learning.charles.springpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import learning.charles.springpetclinic.service.map.VetMapService;

@Controller
public class VetController {

	private final VetMapService vetMapService;

	public VetController(VetMapService vetMapService) {
		super();
		this.vetMapService = vetMapService;
	}

	@RequestMapping({ "/vet", "/vet/index", "/vet/index.html" })
	public String toVetPage(Model model) {
		model.addAttribute("vets", vetMapService.findAll());
		
		return "vet/index";
	}
}
