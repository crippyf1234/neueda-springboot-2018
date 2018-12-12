package uk.ac.belfastmet.belfasteventswebsite.domain;

import java.util.ArrayList;

import lombok.Data;

@Data
public class AllEvents {

	private ArrayList<Events> allEvents;
	
	public Events cycleEvents(String identifier) {
		
		for(int i = 0 ; i < this.allEvents.size() ; i++) {
			
			Events currentEvent = allEvents.get(i);
			
			if(currentEvent.getIdentifier().equals(identifier)) {
				return currentEvent;
			}

		}
		
		return null;
		
	}
}
