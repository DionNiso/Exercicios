package model;

import java.util.ArrayList;

import person.Person;

public class Bird {
	//attributes
	private String name;
	private String nameLatin;
	private int observations;
	public Person discoverer;
	
	//constructor
	public Bird(String name,  String nameLatin, int observations, Person discoverer ) {
		this.name = name;
		this.nameLatin = nameLatin;
		this.observations = observations;
		this.discoverer =  discoverer;
	}
	
	//methods
	// birds ...
	
	////getters and setters


	public Bird(String name2, String nameLatin2, int observations2, ArrayList<Person> discoverer) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	

	public Person getDiscoverer() {
		return discoverer;
	}

	public void setDiscoverer(Person discoverer) {
		this.discoverer = discoverer;
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
		return "Bird [name=" + name + ", nameLatin=" + nameLatin + ", observations=" + observations + ", discoverer=" + discoverer +"]";
	}
}