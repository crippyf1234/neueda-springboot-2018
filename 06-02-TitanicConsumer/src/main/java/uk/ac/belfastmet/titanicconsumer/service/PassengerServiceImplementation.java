package uk.ac.belfastmet.titanicconsumer.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import uk.ac.belfastmet.titanicconsumer.domain.AllPassengers;
import uk.ac.belfastmet.titanicconsumer.domain.Passenger;

public class PassengerServiceImplementation implements PassengerService {
	
	@Value("${api.passenger.url}")
	private String titanicUrl;

	private RestTemplate restTemplate;

	public PassengerServiceImplementation(String titanicUrl, RestTemplate restTemplate) {
		super();
		this.titanicUrl = titanicUrl;
		this.restTemplate = restTemplate;
	}
	
	public ArrayList<Passenger> list(){
		
		UriComponentsBuilder getAllPassengersUrl = UriComponentsBuilder.fromUriString("http://localhost:8090/passengers");
		
		AllPassengers allPassengers = this.restTemplate.getForObject(getAllPassengersUrl.toString(), AllPassengers.class);
		
		return allPassengers.getAllPassengers();
		
	}
	
	public Passenger get(Integer passengerId) {
		
		UriComponentsBuilder getPassengerUrl = UriComponentsBuilder.fromUriString("localhost:8090/passengers/10");
				
		Passenger passenger = this.restTemplate.getForObject(getPassengerUrl.toString(), Passenger.class);
		
		return passenger;
		
	}
	
	public Passenger add(Passenger passenger) {
		return null;
	}
	
	public Passenger update(Passenger passenger) {
		return null;
	}
	
	public void delete(Integer passengerId) {
	
	}
		
}
