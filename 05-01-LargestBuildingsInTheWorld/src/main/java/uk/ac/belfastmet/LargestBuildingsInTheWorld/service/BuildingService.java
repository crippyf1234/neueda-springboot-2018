package uk.ac.belfastmet.LargestBuildingsInTheWorld.service;

import java.util.ArrayList;

import uk.ac.belfastmet.LargestBuildingsInTheWorld.domain.BuildingFloorArea;
import uk.ac.belfastmet.LargestBuildingsInTheWorld.domain.BuildingFootprint;
import uk.ac.belfastmet.LargestBuildingsInTheWorld.domain.BuildingsVolume;

public class BuildingService {

	public ArrayList<BuildingsVolume> getBuildingsVolume(){
		
		
		
		ArrayList<BuildingsVolume> buildingsVolume = new ArrayList<BuildingsVolume>();
		
		BuildingsVolume boeingEverettFactory = new BuildingsVolume("Boeing Everett Factory", 
				"United States", "Everett Washington", "398,000 m2", "13.3 million m3", 
				"Boeing's assembly site for a selection of the company's largest aircraft, "
				+ "originally built for construction of the 747.", "BoeingEverettPlant.png", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2673.7636966630375!2d-122.29196358412064!3d47.92160957415673!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x54900164f9502991%3A0x903b231982d227fd!2sFuture+Of+Flight+Museum!5e0!3m2!1sen!2suk!4v1542980733667\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		
		buildingsVolume.add(boeingEverettFactory);
		
		BuildingsVolume greatMosqueOfMecca = new BuildingsVolume("Great Mosque of Mecca", 
				"Saudi Arabia", "Hijaz-Saudi Arabia", "356,000 m2", "8 million m3", 
				"The largest mosque in the world, the most sacred place for the Muslims, "
				+ "and surrounds Islam's holiest place, the Kaaba.", "GreatMosqueofMecca.png", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3714.162003910501!2d39.823546015406386!3d21.422876379581528!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x15c204b74d3fb493%3A0x55d1f94f8e094785!2sMasjid+al-Haram!5e0!3m2!1sen!2suk!4v1542980819759\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		
		buildingsVolume.add(greatMosqueOfMecca);
		
		BuildingsVolume jeanLucLagarderePlant = new BuildingsVolume("Jean-Luc Lagardère Plant", 
				"France", "Toulouse-Blagnac", "122,500 m2", "5.6 million m3", 
				"The assembly hall of the Airbus A380, the world's largest airliner.", "Jean-LucLagardèrePlant.png", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d92457.01034624902!2d1.3628011707550793!3d43.60067857090314!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x12aebb6fec7552ff%3A0x406f69c2f411030!2sToulouse%2C+France!5e0!3m2!1sen!2suk!4v1542980978446\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		
		buildingsVolume.add(jeanLucLagarderePlant);
		
		BuildingsVolume boeingCompositeWingCenter = new BuildingsVolume("Boeing Composite Wing Center", 
				"United States", "Everett Washington", "111,500 m2", "3.7 million m3", 
				"Boeing's assembly site for the production of composite wings for the 777-8 and 777-9", 
				"BoeingCompositeWingCenter.png", "googlemap");
		
		buildingsVolume.add(boeingCompositeWingCenter);
		
		BuildingsVolume aerium = new BuildingsVolume("Aerium", 
				"Germany", "Halbe, Brandenburg", "70,000 m2", "5.2 million m3", 
				"A hangar originally intended to house the construction of a giant airship, "
				+ "this building now houses an indoor theme park, called Tropical Islands Resort.", "Aerium.png", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2673.763696663038!2d-122.29196358412065!3d47.921609574156726!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x54900164f9502991%3A0x903b231982d227fd!2sFuture+Of+Flight+Museum!5e0!3m2!1sen!2suk!4v1542981066069\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		
		buildingsVolume.add(aerium);
		
		return buildingsVolume;
		
	}
	
//public ArrayList<BuildingFootprint> getBuildingsFootprint(){
//		
//		
//		
//		ArrayList<BuildingFootprint> buildingsFootprint = new ArrayList<BuildingFootprint>();
//		
//		BuildingFootprint aalsmeerFlowerAuctionBuilding = new BuildingFootprint("Aalsmeer Flower Auction Building", 
//				"Netherlands", "Aalsmeer", "518,000 m2", "740 m x 700 m", 
//				"The auction building of the flower auction in Aalsmeer.", "image", "googlemap");
//		
//		BuildingFootprint theDubaiMall = new BuildingFootprint("The Dubai Mall", 
//				"United Arab Emirates", "Dubai", "500,000 m2", "Data Not Avialble", 
//				"Description not available", "image", "googlemap");
//		
//		BuildingFootprint teslaFactory = new BuildingFootprint("Tesla Factory", 
//				"United States", "Fremont, California", "427,354 m2", "Data Not Available", 
//				"Automobile production facility of Tesla Motors.", "image", "googlemap");
//		
//		BuildingFootprint boeingEverettFactory = new BuildingFootprint("Boeing Everett Factory", 
//				"United States", "Everett Washington", "398,000 m2", "900 m x 495 m", 
//				"Boeing's assembly site for a selection of the company's largest aircraft, originally "
//				+ "built for construction of the 747.", 
//				"image", "googlemap");
//		
//		BuildingFootprint daikinTexasTechnology Park = new BuildingFootprint("Daikin Texas Technology Park", 
//				"United States", "Waller, Texas", "393,000 m2", "Data Not Available", 
//				"Factory and distribution center for heating and air conditioning products", "image", "googlemap");
//		
//		return buildingsFootprint;
//		
//	}
//
//public ArrayList<BuildingFloorArea> getBuildingFloorArea(){
//	
//	ArrayList<BuildingFloorArea> buildingFloorArea = new ArrayList<BuildingFloorArea>();
//	
//	BuildingFloorArea newCenturyGlobalCenter = new BuildingFloorArea("New Century Global Center", 
//			"China", "Chengdu", "1,760,000 m2", "image", "googlemap");
//	
//	BuildingFloorArea dubaiInternationalAirportTerminal3 = new BuildingFloorArea("Dubai International Airport Terminal 3", 
//			"United Arab Emirates", "Dubai", "1,713,000 m2", "image", "googlemap");
//	
//	BuildingFloorArea abrajAl-BaitEndowment = new BuildingFloorArea("Abraj Al-Bait Endowment", 
//			" Saudi Arabia", "Mecca", "1,575,815 m2", "image", "googlemap");
//	
//	BuildingFloorArea centralWorld = new BuildingFloorArea("CentralWorld", 
//			"Bangkok", "Everett Washington", "1,024,000 m2",  
//			"image", "googlemap");
//	
//	BuildingFloorArea aalsmeerFlowerAuction = new BuildingFloorArea("Aalsmeer Flower Auction", 
//			"Netherlands", "Aalsmeer", "990,000 m2", "image", "googlemap");
//	
//	return buildingFloorArea;
//}

	
}
