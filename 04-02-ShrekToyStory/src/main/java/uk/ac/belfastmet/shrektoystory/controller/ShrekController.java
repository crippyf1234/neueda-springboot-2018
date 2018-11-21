package uk.ac.belfastmet.shrektoystory.controller;

import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import uk.ac.belfastmet.dwarf.domain.Dwarf;
import uk.ac.belfastmet.dwarf.service.DwarfService;

public class ShrekController {
	@GetMapping("")
	public String disney(Model model) {
		
		DwarfService dwarfService = new DwarfService();
		ArrayList<Dwarf> disneyDwarfs = dwarfService.getDisneyDwarfs();
		
		model.addAttribute("pageTitle","Disney!");
		model.addAttribute("disneyDwarfs", disneyDwarfs);
	
		return "disney.html";
	}
	
}
