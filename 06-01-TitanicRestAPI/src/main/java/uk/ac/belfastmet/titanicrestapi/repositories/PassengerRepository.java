package uk.ac.belfastmet.titanicrestapi.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanicrestapi.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer>{

	Passenger findByPassengerId(Integer passengerId);

}
