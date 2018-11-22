package uk.ac.belfastmet.shrektoystory.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.shrektoystory.domain.Movie;
import uk.ac.belfastmet.shrektoystory.service.MovieService;

@Controller 
@RequestMapping("/shrek")

public class ShrekController {
	@GetMapping("")
	public String disney(Model model) {
		
		MovieService movieService = new MovieService();
		ArrayList<Movie> shrekCharacters = movieService.getShrekCharacters();
		
		model.addAttribute("shrekCharacters", shrekCharacters);
	
		return "shrek.html";
	}
	
}
