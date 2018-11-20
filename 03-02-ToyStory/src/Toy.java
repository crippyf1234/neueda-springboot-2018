
public class Toy {

	
	private String characterName; 
	private String actorFirstName; 
	private String actorSurname;
	
	public Toy(String characterName, String actorFirstName, String actorSurname) {
		super();
		this.characterName = characterName;
		this.actorFirstName = actorFirstName;
		this.actorSurname = actorSurname;
	}

	public String getActorFirstName() {
		return actorFirstName;
	}

	public void setActorFirstName(String actorFirstName) {
		this.actorFirstName = actorFirstName;
	}

	public String getActorSurname() {
		return actorSurname;
	}

	public void setActorSurname(String actorSurname) {
		this.actorSurname = actorSurname;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	
	
	
	
}
