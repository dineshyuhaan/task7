package practice;

import java.util.Scanner;

public class Agelimit {

	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try {

			if (age >= 18) {

				System.out.println("age is valid");
			} else {
				throw new InvalidAgeException("Age is invalid");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e);

		}

	}
}
