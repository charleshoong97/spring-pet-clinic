package learning.charles.springpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

	@RequestMapping({"/owner", "/owner/index", "/owner/index.html"})
	public String toOwnerPage(Model model) {
		return "owner/index";
	}
}
