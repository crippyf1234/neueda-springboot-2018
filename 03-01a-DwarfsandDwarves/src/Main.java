import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> dwarfs = new ArrayList<String>();
		
		dwarfs.add("Happy");
	    dwarfs.add("Sleepy");
	    dwarfs.add("Dopey");
	    dwarfs.add("Bashful");
	    dwarfs.add("Sneezy");
	    dwarfs.add("Doc");
	    dwarfs.add("Grumpy");
		
		ArrayList<String> dwarves = new ArrayList<String>();
		
		dwarves.add("Thorin");
	    dwarves.add("Balin");
	    dwarves.add("Dwalin");
	    dwarves.add("Fili");
	    dwarves.add("Kili");
	    dwarves.add("Dori");
	    dwarves.add("Nori");
	    dwarves.add("Ori");
	    dwarves.add("Oin");
	    dwarves.add("Gloin");
	    dwarves.add("Bifur");
	    dwarves.add("Bofur");
	    dwarves.add("Bombur");
	    
	    System.out.println("The Disney Dwarfs are:");
		
		for(int i = 0 ; i < dwarfs.size(); i ++) {
		System.out.println(dwarfs.get(i));
		}
		
		System.out.println();
		
		System.out.println("The Tolkien Dwarves are:");
		
		for(int j = 0 ; j < dwarves.size(); j ++) {
		System.out.println(dwarves.get(j));
		}
	}

}
