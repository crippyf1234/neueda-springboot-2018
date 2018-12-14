package uk.ac.belfastmet.belfasteventswebsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import uk.ac.belfastmet.belfasteventswebsite.domain.AllEvents;

@Controller
@RequestMapping()
public class BelfastEventsController {

	@GetMapping("/allEvents")
	public String belfastEvents(Model model) {
		
		String belfastEventsUrl = "https://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		RestTemplate restTemplate = new RestTemplate();
		AllEvents allEvents = restTemplate.getForObject(belfastEventsUrl,  AllEvents.class);
		
//		Logger logger = LoggerFactory.getLogger(Events.class);
//		logger.info(allEvents.toString());
		
		
		model.addAttribute("allEvents", allEvents.getAllEvents());
		return "events";
		
	}
	
//  @GetMapping("/event/${identifier}")
//	public String belfastEvent(@PathVariable("identifier") String identifier, Model model) {
//		
//		String belfastEventsUrl = "https://neueda-flask-bndouglas.c9users.io/belfast-events/api/" + identifier;
//		RestTemplate restTemplate = new RestTemplate();
//		AllEvents allEvents = restTemplate.getForObject(belfastEventsUrl,  AllEvents.class);
//	
//		Events event = allEvents.cycleEvents(identifier);
//		
////		Logger logger = LoggerFactory.getLogger(Events.class);
////		logger.info(allEvents.toString());
//		
//		model.addAttribute("events", event);
//		return "event";
//		
//	}
	
}
