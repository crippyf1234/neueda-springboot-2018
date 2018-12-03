package uk.ac.belfastmet.dwarfs.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfs.domain.Dwarfs;
import uk.ac.belfastmet.dwarfs.service.DwarfsService;

@Controller
@RequestMapping("/tolkien")

public class TolkienController {

	@GetMapping("")
	public String disney(Model model) {
		
		DwarfsService tolkienService = new DwarfsService();
		ArrayList<Dwarfs> tolkienDwarfs = tolkienService.getTolkienDwarfs();
		
		model.addAttribute("tolkienDwarfs", tolkienDwarfs);
	
		return "tolkien.html";
	}
	
}
