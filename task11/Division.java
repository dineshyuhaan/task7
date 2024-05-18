package practice;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			int c=a/b;
			
			System.out.println("Division is done  "+ c);
		
		}catch (Exception e) {
			System.out.println("Please enter the valid number not zero");
			
		}
	}

}
