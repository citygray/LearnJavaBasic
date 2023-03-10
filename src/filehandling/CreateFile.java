package filehandling;
import java.io.File;
import java.io.IOException;

public class CreateFile  {

	public static void main(String[] args) {
		try {
			//File myObj = new File("filename.txt"); //폴더를 지정하지 않을 경우 프로젝트 안에 생성

			// 위치 지정 시 use double backslashes
			File myObj = new File("D:\\workspace\\LearnJavaBasic\\fileOutput\\filename.txt"); //폴더를 지정하지 않을 경우 프로젝트 안에 생성
			if(myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}

}
