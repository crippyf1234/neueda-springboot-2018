package uk.ac.belfastmet.dwarfs.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfs.repository.DwarfRepository;



@Controller
@RequestMapping("/disney")

public class DisneyController{
	
	DwarfRepository dwarfRepository;
	
	public DisneyController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}



	@GetMapping("")
	public String disney(Model model) {
		
	//	DwarfsService dwarfsService = new DwarfsService();
	//	ArrayList<Dwarfs> disneyDwarfs = dwarfsService.getDisneyDwarfs();
		model.addAttribute("pageTitle", "Disney");
		model.addAttribute("disneyDwarfs", this.dwarfRepository.findByAuthor("Disney"));
	
		return "dwarf.html";
	}
}
