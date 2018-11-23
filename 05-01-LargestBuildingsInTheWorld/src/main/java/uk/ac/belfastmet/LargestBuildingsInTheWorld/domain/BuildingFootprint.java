package uk.ac.belfastmet.LargestBuildingsInTheWorld.domain;

public class BuildingFootprint extends Building{
	
	private String footprint;
	private String lengthWidth;
	private String description;
	
	public BuildingFootprint() {
		super();
	}

	public BuildingFootprint(String name, String country, String place, String footprint, String lengthWidth, String description, String image, String map) {
		super(name, country, place, image, map);
		this.footprint = footprint;
		this.lengthWidth = lengthWidth;
		this.description = description;
	}

	public String getFootprint() {
		return footprint;
	}

	public void setFootprint(String footprint) {
		this.footprint = footprint;
	}

	public String getLengthWidth() {
		return lengthWidth;
	}

	public void setLengthWidth(String lengthWidth) {
		this.lengthWidth = lengthWidth;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
