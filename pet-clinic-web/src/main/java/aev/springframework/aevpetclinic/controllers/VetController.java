package aev.springframework.aevpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import aev.springframework.aevpetclinic.services.VetService;

@Controller
public class VetController {
	
	private final VetService vetService;	

	public VetController(VetService vetService) {		
		this.vetService = vetService;
	}



	@RequestMapping({ "/vets", "/vets/index", "/vets/index.html" })
	public String listVets(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}

}
