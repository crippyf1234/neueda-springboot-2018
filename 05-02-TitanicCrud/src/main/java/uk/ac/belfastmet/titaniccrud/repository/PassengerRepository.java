package uk.ac.belfastmet.titaniccrud.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titaniccrud.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer>{

	Iterable<Passenger> findByNameContaining(String name);

	Passenger findByPassengerId(Integer passengerId);

	Iterable<Passenger> findByNameContainsOrderByNameAsc(String val);

	Iterable<Passenger> findBySurvived(int i);

	Iterable<Passenger> findBySurvivedOrderByNameAsc(int i);

}
