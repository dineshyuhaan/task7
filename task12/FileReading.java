package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
	public static void main(String[] args) {
		File file = new File("C:/Users/Lenovo/Documents/task 7/new.txt");

		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not found in the specified path");
		}

	}

}
