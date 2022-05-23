package learning.charles.springpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

	@RequestMapping({"/vet", "/vet/index", "/vet/index.html"})
	public String toVetPage(Model model) {
		return "vet/index";
	}
}
