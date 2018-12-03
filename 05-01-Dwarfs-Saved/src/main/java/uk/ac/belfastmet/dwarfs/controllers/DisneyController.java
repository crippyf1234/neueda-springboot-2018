package uk.ac.belfastmet.dwarfs.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfs.domain.Dwarfs;
import uk.ac.belfastmet.dwarfs.service.DwarfsService;


@Controller
@RequestMapping("/disney")

public class DisneyController{
	
	@GetMapping("")
	public String disney(Model model) {
		
		DwarfsService dwarfsService = new DwarfsService();
		ArrayList<Dwarfs> disneyDwarfs = dwarfsService.getDisneyDwarfs();
		
		model.addAttribute("disneyDwarfs", disneyDwarfs);
	
		return "disney.html";
	}
}
