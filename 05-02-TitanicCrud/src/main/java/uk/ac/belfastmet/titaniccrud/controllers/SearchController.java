package uk.ac.belfastmet.titaniccrud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/searchname")
	public String search(@RequestParam("name") String name, Model model) {
		
		model.addAttribute("pageTitle", "Passenger Database");
		model.addAttribute("passengers", this.passengerRepository.findByNameContaining(name));
		
		return "homePage.html";
	}
	
	@GetMapping("/view/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle","View");
	    model.addAttribute("passenger", this.passengerRepository.findByPassengerId(passengerId));
		return "viewPassenger";
	}
	
/** @GetMapping("/delete/{passengerId}")
	public String deletePassenger(@PathVariable("passengegrId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle","View");
		redirectAttributes.addFlashAttribute("message","Dwarf Deleted Successfully");
		return "redirect:/Passenger.html";
	}
**/
}
