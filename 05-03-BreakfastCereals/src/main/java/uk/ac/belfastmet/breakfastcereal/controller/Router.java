package uk.ac.belfastmet.breakfastcereal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.breakfastcereal.repositories.CerealRepository;
@Controller
@RequestMapping("")
public class Router {
	
	CerealRepository cerealRepository;

	public Router(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}
	
	@GetMapping("/searcherealId")
	public String searchCerealId(@RequestParam("cerealId") Integer cerealId, Model model) {
		
		model.addAttribute("cereals", this.cerealRepository.findByCerealId(cerealId));
		
		return "index.html";
		
	}
	
}
