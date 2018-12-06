package uk.ac.belfastmet.dwarfs.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;
import uk.ac.belfastmet.dwarfs.repository.DwarfRepository;

@Controller
@RequestMapping("")

public class DwarfController {
	DwarfRepository dwarfRepository;

	public DwarfController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}
	
	@GetMapping("/dwarfs")
	public String viewAll(Model model) {
		
		
		model.addAttribute("pageTitle","All Dwarfs");
		
		model.addAttribute("dwarfs", this.dwarfRepository.findAll());
		
		return "dwarf.html";
	}
	
	@GetMapping("/view/{dwarfId}")
	public String viewDwarf(@PathVariable("dwarfId") Integer dwarfId, Model model) {
		
		model.addAttribute("pageTitle","View");
	    model.addAttribute("dwarf", this.dwarfRepository.findByDwarfId(dwarfId));
	    
		return "viewDwarf.html";
	}
	
	@GetMapping("/delete/{dwarfId}")
	public String deleteDwarf(@PathVariable("dwarfId") Integer dwarfId,  Model model, RedirectAttributes redirectAttributes) {
		
		this.dwarfRepository.deleteById(dwarfId);
		redirectAttributes.addFlashAttribute("message","Dwarf Deleted Successfully");
		
		return "redirect:/dwarfs";
	}
	
	@GetMapping("/add")
	public String addDwarf(Model model) {
		
		model.addAttribute("pageTitle", "Add");
		model.addAttribute("dwarf", new Dwarf());
		
		return "editDwarf.html";
	}	
	
	@PostMapping("/save")
	public String saveDwarf(@Valid Dwarf dwarf, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors())
		{
			return "editDwarf.html";
		}
		
		else {
			Dwarf savedDwarf = this.dwarfRepository.save(dwarf);
			return "redirect:/view/" + dwarf.getDwarfId(); 
		}
	}
	
	@GetMapping("/edit/{dwarfId}")
	public String editDwarf(@PathVariable("dwarfId") Integer dwarfId, Model model) {
		
		model.addAttribute("pageTitle", "Edit");
		model.addAttribute("dwarf", this.dwarfRepository.findByDwarfId(dwarfId));
		
		return "editDwarf";
	}
	
	
}
