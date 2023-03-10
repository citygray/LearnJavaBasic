package classes;

//Built-in Packages
import java.util.Scanner; //Import a single class
import java.util.*; //Import the whole package

public class JavaPackages {
	/*
	 * Built-in Packages (packages from the Java API)
	 * User-defined Packages (create your own packages)
	 */

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter user name");
		
		String userName = myObj.nextLine();
		System.out.println("Username is: "+ userName);
		

	}

}
