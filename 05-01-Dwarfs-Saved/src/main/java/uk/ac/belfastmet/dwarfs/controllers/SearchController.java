package uk.ac.belfastmet.dwarfs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.dwarfs.repository.DwarfRepository;
;

@Controller
@RequestMapping("")

public class SearchController {
	
		DwarfRepository dwarfRepository;
		
		public SearchController(DwarfRepository dwarfRepository) {
			super();
			this.dwarfRepository = dwarfRepository;
		}

		@GetMapping("/searchid")
		public String searchId(@RequestParam("id") Integer dwarfId, Model model) {
			model.addAttribute("pageTitle","Search!");
		    model.addAttribute("dwarfs", this.dwarfRepository.findByDwarfId(dwarfId));
			return "dwarf.html";
		}
		
		@PostMapping("/searchname")
		public String searchName(@RequestParam("name") String name, Model model) {
			model.addAttribute("pageTitle","Search!");
		    model.addAttribute("dwarfs", this.dwarfRepository.findByName(name));
			return "dwarf.html";
		}
		
		@GetMapping("/searchauthor")
		public String searchAuthor(@RequestParam("author") String author, Model model) {
			model.addAttribute("pageTitle","Search!");
		    model.addAttribute("dwarfs", this.dwarfRepository.findByAuthor(author));
			return "dwarf.html";
		}
		
		@GetMapping("/searchbyauthorandname")
		public String searchNameAuthor(@RequestParam("name") String name, @RequestParam("author") String author, Model model) {
			model.addAttribute("pageTitle","Search!");
		    model.addAttribute("dwarfs", this.dwarfRepository.findByNameAndAuthor(name,author));
			return "dwarf.html";
		}
		
		@GetMapping("/searchbyauthorandid")
		public String searchNameAuthor(@RequestParam("id") Integer dwarfId, @RequestParam("author") String author, Model model) {
			model.addAttribute("pageTitle","Search!");
		    model.addAttribute("dwarfs", this.dwarfRepository.findByAuthorAndDwarfId(dwarfId,author));
			return "dwarf.html";
		}
		
}


