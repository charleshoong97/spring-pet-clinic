package learning.charles.springpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import learning.charles.springpetclinic.service.map.OwnerMapService;

@Controller
public class OwnerController {

	private final OwnerMapService ownerMapService;

	public OwnerController(OwnerMapService ownerMapService) {
		super();
		this.ownerMapService = ownerMapService;
	}

	@RequestMapping({ "/owner", "/owner/index", "/owner/index.html" })
	public String toOwnerPage(Model model) {
		model.addAttribute("owners", ownerMapService.findAll());
		return "owner/index";
	}

}
