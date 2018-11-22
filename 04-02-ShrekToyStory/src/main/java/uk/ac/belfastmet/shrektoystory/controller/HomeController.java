package uk.ac.belfastmet.shrektoystory.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")

public class HomeController {
	@GetMapping("")
	public String disney(Model model) {
		
		model.addAttribute("disneyPixarLocation", "<iframe src=\"https://www.google.com/maps/embed?pb=\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
	
		return "index.html";
	}
	
}
