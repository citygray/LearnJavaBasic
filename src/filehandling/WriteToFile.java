package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		File myObj = new File("filename.txt"); 
		try {
			FileWriter myWriter = new FileWriter(myObj);
			myWriter.write("change WriteTofile code");
			myWriter.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
	}

}
