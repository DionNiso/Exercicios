package person;

public class Main {
	public static void main(String[] args){
		Person pekka = new Person ("Pekka");
		Person dioniso = new Person ("Dioniso");
		Person demi = new Person ("Demi");
		
	pekka.printPerson();
	dioniso.printPerson();
	demi.printPerson();
	
	pekka.setWeight(50);
	pekka.setHeight(176);
	
	dioniso.setWeight(74);
	dioniso.setHeight(176);
	
	demi.setWeight(55);
	
	int i = 0;
	while ( i < 30) {
		pekka.becomeOlder();
		i++;
		}
	dioniso.becomeOlder();
	
	System.out.println("");
	
	System.out.println(pekka);
	System.out.println(dioniso);
	System.out.println(demi);
	
	System.out.println("");
	
	if (pekka.isAdult()) {
		System.out.print(pekka.getName() + " is an adult: ");
		pekka.printPerson();
	}
	else {
		System.out.print(pekka.getName() + " is a minor: ");
		pekka.printPerson();
		}
	if (dioniso.isAdult()) {
		System.out.print(dioniso.getName() + " is an adult: ");
		dioniso.printPerson();
	}
	else {
		System.out.print(dioniso.getName() + " is a minor: ");
		dioniso.printPerson();
	}
	if (demi.isAdult()) {
		System.out.print(demi.getName() + " is an adult: ");
		demi.printPerson();
	}
	else {
		System.out.print(demi.getName() + " is a minor: ");
		demi.printPerson();	
		}

	System.out.println("");
	
	System.out.println(pekka.getName() + " body mass index: " + pekka.bodyMassIndex());
	
	System.out.println(pekka);
			
	System.out.println(dioniso.getName() + " body mass index: " + dioniso.bodyMassIndex());
	}
}
