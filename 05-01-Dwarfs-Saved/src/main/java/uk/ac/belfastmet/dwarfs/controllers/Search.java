package uk.ac.belfastmet.dwarfs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/search")


public class Search {
	@GetMapping("")
		public String disney(Model model) {
			model.addAttribute("pageTitle", "Search");
				
			
				return "search.html";
			}
}

