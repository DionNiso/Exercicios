package utils;
import java.util.ArrayList;

import person.Person;


public class InitialPersonFilling {

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
}
