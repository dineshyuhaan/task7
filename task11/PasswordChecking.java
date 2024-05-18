package practice;

import java.util.Scanner;

public class PasswordChecking {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String pwd = sc.nextLine();
		final String CORRECTPWD = "Password@1725";
		try {
			if (!pwd.equals(CORRECTPWD)) {
				throw new Exception("The password is incorrect");
			}
			System.out.println("login success");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}