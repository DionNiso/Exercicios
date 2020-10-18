package exercicios;
import java.util.ArrayList;
import java.util.Collections;


public class Ej62 {
		
	public static void main(String[] args) {
		System.out.println("Program to count the amount of item in a list, remove the last item and sort the remained items");
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("C#");
		list.add("Pascal");
		list.add("Java");
		list.add("Python");
		

		countItems(list);
		removeLast(list); 
		
		Collections.sort(list);
		
		System.out.println("These are the items of this list");
		System.out.println(countItems(list));
		System.out.println("The remained items in the list are" + list);
		
		}
		public static int countItems(ArrayList<String> list) {
			return list.size();
	
		}
		public static void removeLast(ArrayList<String> list) {
			if (list.isEmpty()) {
				return;
				}
			list.remove(list.size()-1);
			}
}
