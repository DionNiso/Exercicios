package utils;

import java.util.ArrayList;

import model.Bird;
import person.Person;

public class InitialBirdsFilling {
	
		public static ArrayList<Bird> birds = new ArrayList<Bird>();
		public static ArrayList<Person> discovers = new ArrayList<Person>();
		
		
		static {
		    	discovers.add(new Person("Ami"));
		    	discovers.add(new Person("Janis"));
		    	discovers.add(new Person("Jimi"));
		    }
		    
		static {
		    	discovers.add(new Person("Robert"));
		    	discovers.add(new Person("Freddy"));
		}
		
		
	    static {
	    	birds.add(new Bird("Owls","Owls", 7, discovers.get(0)));
	    	birds.add(new Bird("Columbidae","Columbidae",6, discovers.get(1)));
	    	birds.add(new Bird("Finches", "Finches",9, discovers.get(2)));
	    }
	    
	    static {
	    	birds.add(new Bird("Finches", "Finches",12, discovers.get(3)));
	    	birds.add(new Bird("Pigeon", "Pigeon",5, discovers.get(4)));
	    }
}