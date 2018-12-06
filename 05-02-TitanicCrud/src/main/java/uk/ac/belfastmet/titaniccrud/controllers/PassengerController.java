package uk.ac.belfastmet.titaniccrud.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import uk.ac.belfastmet.titaniccrud.domain.Passenger;
import uk.ac.belfastmet.titaniccrud.repository.PassengerRepository;

@Controller
@RequestMapping("")
public class PassengerController {
	
	PassengerRepository passengerRepository;

	public PassengerController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	
	@GetMapping("/passenger")
	public String passenger(Model model) {
		
		model.addAttribute("pageTitle", "Passenger Database");
		model.addAttribute("passengers", this.passengerRepository.findAll());
		
		return "passengersPage.html";
	}

	
	
	@GetMapping("/delete/{passengerId}")
	public String deletePassenger(@PathVariable("passengerId") Integer passengerId, Model model, RedirectAttributes redirectAttributes) {
		
		this.passengerRepository.deleteById(passengerId);
		redirectAttributes.addFlashAttribute("message", "Delete was Successful");
		
		return "redirect:/passenger";
	}
	
	@GetMapping("/add/")
	public String addPassenger(Model model) {
		
		model.addAttribute("pageTitle", "Add Passenger");
		model.addAttribute("passenger", new Passenger());
		
		return "editPassenger.html";
	}
	
	@PostMapping("/save")
	public String savePassenger(@Valid Passenger passenger, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors())
		{
			return "editPassenger.html";
		}
		
		else {
			Passenger savedPassenger = this.passengerRepository.save(passenger);
			return "redirect:/view/" + passenger.getPassengerId(); 
		}
	}
	
	@GetMapping("/edit/{passengerId}")
	public String editPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		
		model.addAttribute("pageTitle", "Edit");
		model.addAttribute("passenger", this.passengerRepository.findByPassengerId(passengerId));
		
		return "editPassenger.html";
	}
}
