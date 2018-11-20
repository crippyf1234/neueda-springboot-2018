import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		ArrayList<Toy> toys = new ArrayList<Toy>();
		
		    Toy woody = new Toy("Woody", "Tom", "Hanks");
		    Toy ham = new Toy("Ham", "John", "Ratzenberger");
		    Toy rex = new Toy("Rex", "Wallace", "Shawn");
		    Toy mrPotatoHead = new Toy("Mr Potato Head", "Don", "Rickles");
		    Toy buzz = new Toy("Buzz", "Tim", "Allen");
		    Toy slinky = new Toy("Slinky", "Jim", "Varney");
		    
		    toys.add(woody);
		    toys.add(ham);
		    toys.add(rex);
		    toys.add(mrPotatoHead);
		    toys.add(buzz);
		    toys.add(slinky);

		for(Toy toy: toys) {
			System.out.println(toy.getCharacterName() + " " + toy.getActorFirstName() + " " + toy.getActorSurname());
		}
	}

}
