package uk.ac.belfastmet.LargestBuildingsInTheWorld.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.LargestBuildingsInTheWorld.domain.BuildingsVolume;
import uk.ac.belfastmet.LargestBuildingsInTheWorld.service.BuildingService;

@Controller
@RequestMapping("/buildingvolume")

public class BuildingVolumeController {
	
@GetMapping("")
	
	public String buildingVolume(Model model) {
	
	    BuildingService buildingService = new BuildingService();
	    
	    ArrayList<BuildingsVolume> buildingVolume = buildingService.getBuildingsVolume();
	
		model.addAttribute("buildingVolume", buildingVolume);
	
		return "buildingsvolume";
		
	}

}
