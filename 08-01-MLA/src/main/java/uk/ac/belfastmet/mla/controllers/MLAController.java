package uk.ac.belfastmet.mla.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.mla.domain.AllMembersAPI;
import uk.ac.belfastmet.mla.domain.AllMembersList;

@Controller
@RequestMapping()
public class MLAController {
	
	@GetMapping("")
	public String home(){
		return "index.html";
	}
	
	@GetMapping("/NorthDown")
	public String getConstituency(Model model){
		
		String mlaUrl = "http://data.niassembly.gov.uk/members_json.ashx?m=GetAllCurrentMembers";
		RestTemplate restTemplate = new RestTemplate();
		AllMembersAPI allMembersAPI = restTemplate.getForObject(mlaUrl, AllMembersAPI.class);
		AllMembersList allMembers = allMembersAPI.getAllMembersList();
		
		model.addAttribute("constituencyMembers", allMembers.getByConstituency("North Down"));
		
		return "constituency";
	}
	
}
