package uk.ac.belfastmet.dwarf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/index")

public class HomeController {

	@GetMapping("")
	public String homepage(Model model) {
		return "index.html";


	}
	
}
