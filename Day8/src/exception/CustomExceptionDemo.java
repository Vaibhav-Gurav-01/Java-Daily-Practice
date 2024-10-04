package exception;

import java.util.Scanner;

class CheckPassword extends Exception {
	// child parent

	public CheckPassword(String msg) {
		super(msg);
	}
}

public class CustomExceptionDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Password: ");
		String pass = sc.next();
		try {
			if (pass.length() < 8) {
				throw new CheckPassword("Password length should be more than 8");
			}
			// --->anonymous obj
			// to check for all pattern matching

			else if (pass.matches("[A-Za-z0-9]*")) {
				throw new CheckPassword("Password should have special character");

			} else {
				System.out.println("valid password");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			// "[0-9]{6}"; 6 numbers are allowed [a-z]{5}: 5 ch allowed
		}

	}
}
