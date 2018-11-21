package uk.ac.belfastmet.shrektoystory.service;

import java.util.ArrayList;

import uk.ac.belfastmet.dwarf.domain.Dwarf;

public class MovieService {
	public MovieService(){
		super();
	}
	
	public ArrayList<Movie> getShrekCharacters(){
		
        ArrayList<Movie> characters = new ArrayList<Movie>();
		
		Movie shrek = new Movie("Shrek", "Shrek", "Shrek.png");
		characters.add(shrek);
		
		Movie princessFiona = new Movie("Princess Fiona", "Shrek", "PrincessFiona.png");
		characters.add(princessFiona);
		
		Movie donkey = new Movie("Donkey", "Shrek", "Donkey.png");
		characters.add(donkey);
		
		Movie gingerBreadman = new Movie("Ginger Breadman", "Shrek", "GingerBreadman.png");
		characters.add(gingerBreadman);
		
		return characters;
		
	}
	


}
