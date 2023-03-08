package map;

import java.util.HashMap;

public class JavaHashMap {
	public static void main(String[] args) {

		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// Add keys and values(Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities.get("England"));
		
//		capitalCities.remove("England");
//		capitalCities.clear();
		System.out.println(capitalCities.get("England"));
		
		System.out.println("print key----");
		for(String i : capitalCities.keySet()) {
			System.out.println(i);
		}
		System.out.println("print value----");
		for(String i : capitalCities.values()) {
			System.out.println(i);
		}
		System.out.println("print key and value----");
		for(String i : capitalCities.keySet()) {
			System.out.println("key: "+i+" /value: "+capitalCities.get(i));
		}
		
		HashMap<Integer,String> students = new HashMap<Integer,String>();
		students.put(1, "Jone");
		students.put(2, "Steve");
		students.put(3, "Ann");
		students.put(6, "Jessi");
		students.put(7, "Mack");
		students.put(1, "Angie");
		
		System.out.println("print student key and value----");
		for(Integer i : students.keySet()) {
			System.out.println("key: "+i+" /value: "+students.get(i));
		}
	}

}
