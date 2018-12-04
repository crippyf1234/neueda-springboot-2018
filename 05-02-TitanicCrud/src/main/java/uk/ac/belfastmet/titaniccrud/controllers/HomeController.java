package uk.ac.belfastmet.titaniccrud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("")
public class HomeController {
	
	@GetMapping("")
	public String passenger(Model model) {
		
		model.addAttribute("pageTitle", "Home");
		
		return "homePage.html";
	}
}
