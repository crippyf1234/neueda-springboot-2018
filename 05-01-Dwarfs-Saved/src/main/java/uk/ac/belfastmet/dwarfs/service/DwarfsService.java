package uk.ac.belfastmet.dwarfs.service;

import java.util.ArrayList;

import uk.ac.belfastmet.dwarfs.domain.Dwarfs;

public class DwarfsService {
	
	public DwarfsService(){
		super();
	}
	
	public ArrayList<Dwarfs> getDisneyDwarfs(){
	
        ArrayList<Dwarfs> dwarfs = new ArrayList<Dwarfs>();
		
        Dwarfs sleepy = new Dwarfs();
		sleepy.setName("Sleepy");
		sleepy.setAuthor("Disney");
		sleepy.setImage("Sleepy.png");
		
		Dwarfs happy = new Dwarfs();
		happy.setName("Happy");
		happy.setAuthor("Disney");
		happy.setImage("Happy.png");
		
		Dwarfs dopey = new Dwarfs();
		dopey.setName("Dopey");
		dopey.setAuthor("Disney");
		dopey.setImage("Dopey.png");
		
		Dwarfs grumpy = new Dwarfs();
		grumpy.setName("Grumpy");
		grumpy.setAuthor("Disney");
		grumpy.setImage("Grumpy.png");
		
		Dwarfs bashful = new Dwarfs();
		bashful.setName("Bashful");
		bashful.setAuthor("Disney");
		bashful.setImage("Bashful.png");
		
		Dwarfs sneezy = new Dwarfs();
		sneezy.setName("Sneezy");
		sneezy.setAuthor("Disney");
		sneezy.setImage("Sneezy.png");
		
		Dwarfs doc = new Dwarfs();
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
	
	public ArrayList<Dwarfs> getTolkienDwarfs(){
		
        ArrayList<Dwarfs> dwarfs = new ArrayList<Dwarfs>();
		
        Dwarfs thorin = new Dwarfs("Thorin","Tolkien", "Thorin.png");
		Dwarfs balin = new Dwarfs("Balin","Tolkien", "Balin.png");
		Dwarfs dwalin = new Dwarfs("Dwalin","Tolkien", "Dwalin.png");
		Dwarfs fili = new Dwarfs("Fili","Tolkien", "Fili.png");
		Dwarfs kili = new Dwarfs("Kili","Tolkien", "Kili.png");
		Dwarfs dori = new Dwarfs("Dori","Tolkien", "Dori.png");
		Dwarfs nori = new Dwarfs("Nori","Tolkien", "Nori.png");
		Dwarfs ori = new Dwarfs("Ori","Tolkien", "Ori.png");
		Dwarfs oin = new Dwarfs("Oin","Tolkien", "Oin.png");
		Dwarfs gloin = new Dwarfs("Gloin","Tolkien", "Gloin.png");
		Dwarfs bifur = new Dwarfs("Bifur","Tolkien", "Bifur.png");
		Dwarfs bofur = new Dwarfs("Bofur","Tolkien", "Bofur.png");
		Dwarfs bombur = new Dwarfs("Bombur","Tolkien", "Bombur.png");
		
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
