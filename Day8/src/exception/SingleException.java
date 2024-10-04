package exception;

import java.util.Scanner;

public class SingleException {

	public static double division(int num1, int num2) {
		return (num1 / num2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter 2 Numbers: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			double result = division(num1, num2);
			System.out.println("Result is : " + result);

		} catch (ArithmeticException e) {
			System.out.println("We cannot divide num by 0...");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
		}

	}

}
