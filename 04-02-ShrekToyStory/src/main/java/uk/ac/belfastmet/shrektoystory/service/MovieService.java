package uk.ac.belfastmet.shrektoystory.service;

import java.util.ArrayList;


import uk.ac.belfastmet.shrektoystory.domain.Movie;

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
		
		Movie gingerBreadman = new Movie("Ginger Breadman", "Shrek", "GingerbreadMan.png");
		characters.add(gingerBreadman);
		
		return characters;
		
	}
	
	public ArrayList<Movie> getToyStoryCharacters(){
		
		ArrayList<Movie> characters = new ArrayList<Movie>();
		
		Movie woody = new Movie("Woody", "Toy Story", "Woody.png");
		characters.add(woody);
		
		Movie buzz = new Movie("Buzz", "Toy Story", "Buzz.png");
		characters.add(buzz);
		
		Movie rex = new Movie("Rex", "Toy Story", "Rex.png");
		characters.add(rex);
		
		Movie mrPotatoHead = new Movie("Mr Potato Head", "Toy Story", "MrPotatoHead.png");
		characters.add(mrPotatoHead);
		
		return characters;
		
	}
	


}
