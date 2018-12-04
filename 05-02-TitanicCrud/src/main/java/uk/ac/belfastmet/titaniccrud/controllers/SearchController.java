package uk.ac.belfastmet.titaniccrud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.titaniccrud.repository.PassengerRepository;

@Controller
@RequestMapping("")

public class SearchController {
	
	PassengerRepository passengerRepository;

	public SearchController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	
	@GetMapping("/searchid")
	public String search(@RequestParam("id") Integer passengerId, Model model) {
		
		model.addAttribute("pageTitle", "Passenger Database");
		model.addAttribute("passengers", this.passengerRepository.findByPassengerId(passengerId));
		
		return "homePage.html";
	}
	
	
}
