package exercicios;
import java.util.ArrayList;


public class Ej61 {
		
	public static void main(String[] args) {
		System.out.println("Program to count the amount of item in a list and remove the first");
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("Pascal");
		list.add("Java");
		list.add("Python");

		countItems(list);
		removeFirst(list); 
		
		System.out.println("These are the items of this list");
		System.out.println(countItems(list));
		}
		public static int countItems(ArrayList<String> list) {
			return list.size();
	
		}
		public static void removeFirst(ArrayList<String> list) {
			if (list.isEmpty()) {
				return;
				}
			list.remove(0);}
}
