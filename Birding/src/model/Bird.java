package model;

public class Bird {
	//attributes
	private String name;
	private String nameLatin;
	private int observations;
	private String discover;
	
	//constructor
	public Bird(String name,  String nameLatin, int observations, String discover ) {
		this.name = name;
		this.nameLatin = nameLatin;
		this.observations = observations;
		this.discover = discover;
	}
	
	//methods
	// birds ...
	
	////getters and setters

	public String getDiscover() {
		return discover;
	}

	public void setDiscover(String discover) {
		this.discover = discover;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameLatin() {
		return nameLatin;
	}

	public void setNameLatin(String nameLatin) {
		this.nameLatin = nameLatin;
	}

	public int getObservations() {
		return observations;
	}

	public void setObservations(int observations) {
		this.observations = observations;
	}
	
	public void addObservation() {
		this.observations ++;
	}
	
	public void addObservation(int observations) {
		this.observations += observations;
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + ", nameLatin=" + nameLatin + ", observations=" + observations + ", discover=" + discover +"]";
	}
}