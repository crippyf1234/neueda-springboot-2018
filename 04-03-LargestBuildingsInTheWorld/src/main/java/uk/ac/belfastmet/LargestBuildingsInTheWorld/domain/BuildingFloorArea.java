package uk.ac.belfastmet.LargestBuildingsInTheWorld.domain;

public class BuildingFloorArea extends Building{
	
	private String floorArea;

	public BuildingFloorArea() {
		super();
	}

	public BuildingFloorArea(String name, String country, String place, String floorArea, String image, String map) {
		super(name, country, place, image, map);
		this.floorArea = floorArea;
	}

	public String getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}
	
	

}
