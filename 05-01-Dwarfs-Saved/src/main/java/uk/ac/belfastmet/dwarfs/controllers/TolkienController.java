package uk.ac.belfastmet.dwarfs.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import uk.ac.belfastmet.dwarfs.repository.DwarfRepository;


@Controller
@RequestMapping("/tolkien")

public class TolkienController {

	DwarfRepository dwarfRepository;
	
	
	public TolkienController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}




	@GetMapping("")
	public String disney(Model model) {
		
	//	DwarfsService tolkienService = new DwarfsService();
	//	ArrayList<Dwarf> tolkienDwarfs = tolkienService.getTolkienDwarfs();
		model.addAttribute("pageTitle", "Tolkien");
		model.addAttribute("dwarfs", this.dwarfRepository.findByAuthor("Tolkien"));
	
		return "dwarf.html";
	}
	
}
