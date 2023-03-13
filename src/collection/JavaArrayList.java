package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class JavaArrayList {
	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();

		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		// Sort an ArrayList
		System.out.println("Sort an ArrayList");
		Collections.sort(cars); // Sort cars

		for (String i : cars) {
			System.out.println(i);
		}

		// Sort Numbers
		System.out.println("--Sort Numbers--");
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(5);
		myNumbers.add(15);
		myNumbers.add(2);
		myNumbers.add(3);
		myNumbers.add(9);
		myNumbers.add(8);
		myNumbers.add(10);

		Collections.sort(myNumbers);

		for (int i : myNumbers) {
			System.out.println(i);
		}

		/*
		 * System.out.println(cars.get(0));
		 * 
		 * //Change an Item cars.set(0,"Opel"); System.out.println(cars.get(0));
		 * 
		 * for (int i = 0; i < cars.size(); i++) {
		 * System.out.println("차 종류:"+cars.get(i)); }
		 * 
		 * //for-each loop System.out.println("for-each loop----"); for(String i:cars) {
		 * System.out.println(i); }
		 * 
		 * //remove an Item cars.remove(0); System.out.println(cars.get(0));
		 * cars.clear();
		 * 
		 * //ArrayList size System.out.println(cars.size());
		 * 
		 */

		
	}

}
