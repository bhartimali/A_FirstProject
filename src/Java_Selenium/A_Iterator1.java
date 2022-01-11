package Java_Selenium;

import java.util.ArrayList;
import java.util.Iterator;

public class A_Iterator1 {

	public static void main(String[] args) {
		// ArrayList
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(12);
		number.add(2);
		number.add(15);
		number.add(5);
		//Iterator
		Iterator<Integer> it = number.iterator();
		while(it.hasNext()) {
			Integer i= it.next();
			if(i<10) {
				it.remove();
			}
		}
		System.out.println(number);
	}

}
