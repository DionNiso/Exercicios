package utils;

import java.util.ArrayList;

import model.Bird;

public class InitialBirdsFilling {
	
	
	    //public static List<Bird> birds = new LinkedList<Bird>();
		public static ArrayList<Bird> birds = new ArrayList<Bird>();
	 
	    static {
	    	birds.add(new Bird("Owls","Owls",5, "Ami"));
	    	birds.add(new Bird("Columbidae","Columbidae",6, "Janis"));
	    	birds.add(new Bird("Finches", "Finches",9, "Jimi"));
	    }
	    
	    static {
	    	birds.add(new Bird("Finches", "Finches",12, "Robert"));
	    	birds.add(new Bird("Pigeon", "Pigeon",5, "Freddy"));
	    }
}