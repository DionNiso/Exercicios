package person;

	
public class MainPerson {
	public static void main(String[] args) {
	Person rocio = new Person ("Rocio");
	Person manolo = new Person ("Manolo");

	rocio.printPerson();

	rocio.setAge(30);
	manolo.setAge(17);
	//System
	System.out.println (rocio);
	System.out.println (manolo);
	
	if(rocio.isAdult())
		System.out.println (rocio.getName() + " is adult");
	else 
		System.out.println (rocio.getName()+ " is minor");
	
	if(manolo.isAdult())
		System.out.println (manolo.getName() + " is adult");
	else 
		System.out.println (manolo.getName()+ " is minor");
	
}	
	
}
