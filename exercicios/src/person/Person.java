package person;

public class Person {
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
	private String name;
	private int age;
	
	public Person(String initialName){
		this.age = 0;
		this.name = name;
		
	}
	public void printPerson() {
		System.out.println(this.name  + ", age: " + this.age + " years");
	}
	public boolean isAdult() {
		if (this.age < 18) {
		return false;
		}
		return true;
	}
	public String toString() {
		return this.name + " age " + this.age + " years";
	}
	 void setWeight(int i) {
		// TODO Auto-generated method stub
		
	}
}

