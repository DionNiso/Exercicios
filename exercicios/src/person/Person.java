package person;

public class Person {
	private String name;
	private int age;
	private int weight;
	private int height;
	
	public String toString() {
		return this.name + ", age" + this.age+ "years" + this.weight + " weight" + this.height + " height" + bodyMassIndex();
	}

	public Person (String initialName) {
		this.age = 0;
		this.name = initialName;
		this.weight = 0;
		this.height = 0;
	}
	
	public void printPerson() {
		System.out.println(this.name + ", age " + this.age + " years");
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void becomeOlder() {
		this.age = this.age + 1;
		
	}
	public boolean isAdult() {
		if (this.age < 18) {
			return false;
		} 
		return true;
	}
	public void setWeight(int newWeight){
		this.weight = newWeight;
	}
	public void setHeight(int newHeight){
		this.height = newHeight;
	}
	
	public double bodyMassIndex() {
		double heightDivideByHundred =  this.height / 100;
		return this.weight / (heightDivideByHundred * heightDivideByHundred);
	}	
}


