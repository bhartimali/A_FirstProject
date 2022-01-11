package Java_Selenium;

import java.util.ArrayList;
import java.util.Iterator;

public class A_Iterator {

	public static void main(String[] args) {
		// Make a collection
		ArrayList<String> car= new ArrayList<String>();
		car.add("Volvo");
		car.add("Ford");
		car.add("BMW");
		
		// Get the iterator
		Iterator<String> iter = car.iterator();
		
		//Print the first item
		//System.out.println(""+iter.next());
		
		//Pring the all item
		while(iter.hasNext()) {
			System.out.println(""+iter.next());
		}
	}

}
