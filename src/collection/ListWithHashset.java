package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class ListWithHashset {

	public static void main(String[] args) {
		ArrayList<HashSet<Integer>> numList = new ArrayList<HashSet<Integer>>();

		HashSet<Integer> numbers = new HashSet<Integer>();

		// Add values to the set
		numbers.add(4);
		numbers.add(7);
		numbers.add(8);

		numList.add(numbers);

		for (HashSet<Integer> i : numList) {
			numbers = i;
			for (Integer j : numbers) {
				System.out.println(j);
			}
		}
	}


}
