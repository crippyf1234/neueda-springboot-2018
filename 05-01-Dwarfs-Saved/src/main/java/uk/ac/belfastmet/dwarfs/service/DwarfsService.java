package uk.ac.belfastmet.dwarfs.service;

import java.util.ArrayList;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

public class DwarfsService {
	
	public DwarfsService(){
		super();
	}
	
	public ArrayList<Dwarf> getDisneyDwarfs(){
	
        ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
        Dwarf sleepy = new Dwarf();
		sleepy.setName("Sleepy");
		sleepy.setAuthor("Disney");
		sleepy.setImage("Sleepy.png");
		
		Dwarf happy = new Dwarf();
		happy.setName("Happy");
		happy.setAuthor("Disney");
		happy.setImage("Happy.png");
		
		Dwarf dopey = new Dwarf();
		dopey.setName("Dopey");
		dopey.setAuthor("Disney");
		dopey.setImage("Dopey.png");
		
		Dwarf grumpy = new Dwarf();
		grumpy.setName("Grumpy");
		grumpy.setAuthor("Disney");
		grumpy.setImage("Grumpy.png");
		
		Dwarf bashful = new Dwarf();
		bashful.setName("Bashful");
		bashful.setAuthor("Disney");
		bashful.setImage("Bashful.png");
		
		Dwarf sneezy = new Dwarf();
		sneezy.setName("Sneezy");
		sneezy.setAuthor("Disney");
		sneezy.setImage("Sneezy.png");
		
		Dwarf doc = new Dwarf();
		doc.setName("Doc");
		doc.setAuthor("Disney");
		doc.setImage("Doc.png");
		
	
		dwarfs.add(sleepy);
		dwarfs.add(happy);
		dwarfs.add(dopey);
		dwarfs.add(grumpy);
		dwarfs.add(bashful);
		dwarfs.add(sneezy);
		dwarfs.add(doc);
		
		return dwarfs;
	}
	
	public ArrayList<Dwarf> getTolkienDwarfs(){
		
        ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
        Dwarf thorin = new Dwarf("Thorin","Tolkien", "Thorin.png");
		Dwarf balin = new Dwarf("Balin","Tolkien", "Balin.png");
		Dwarf dwalin = new Dwarf("Dwalin","Tolkien", "Dwalin.png");
		Dwarf fili = new Dwarf("Fili","Tolkien", "Fili.png");
		Dwarf kili = new Dwarf("Kili","Tolkien", "Kili.png");
		Dwarf dori = new Dwarf("Dori","Tolkien", "Dori.png");
		Dwarf nori = new Dwarf("Nori","Tolkien", "Nori.png");
		Dwarf ori = new Dwarf("Ori","Tolkien", "Ori.png");
		Dwarf oin = new Dwarf("Oin","Tolkien", "Oin.png");
		Dwarf gloin = new Dwarf("Gloin","Tolkien", "Gloin.png");
		Dwarf bifur = new Dwarf("Bifur","Tolkien", "Bifur.png");
		Dwarf bofur = new Dwarf("Bofur","Tolkien", "Bofur.png");
		Dwarf bombur = new Dwarf("Bombur","Tolkien", "Bombur.png");
		
		dwarfs.add(thorin);
		dwarfs.add(balin);
		dwarfs.add(dwalin);
		dwarfs.add(fili);
		dwarfs.add(kili);
		dwarfs.add(dori);
		dwarfs.add(nori);
		dwarfs.add(ori);
		dwarfs.add(oin);
		dwarfs.add(gloin);
		dwarfs.add(bifur);
		dwarfs.add(bofur);
		dwarfs.add(bombur);
		
		return dwarfs;
		
	}
	
}
