package uk.ac.belfastmet.titaniccrud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titaniccrud.repository.PassengerRepository;

@Controller
@RequestMapping("/passenger")
public class PassengerController {
	
	PassengerRepository passengerRepository;

	public PassengerController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	
	@GetMapping("")
	public String passenger(Model model) {
		
		model.addAttribute("pageTitle", "Passenger Database");
		model.addAttribute("passengers", this.passengerRepository.findAll());
		
		return "passengersPage.html";
	}
}
