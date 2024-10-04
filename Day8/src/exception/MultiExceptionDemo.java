package exception;

import java.util.Scanner;

public class MultiExceptionDemo {

	public static double division(int num1, int num2) {
		return (num1 / num2);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 values: ");
		String str = sc.next();
		String str1 = sc.next();

		try {
			int num1 = Integer.parseInt(str);
			int num2 = Integer.parseInt(str1);

			double result = division(num1, num2);

			System.out.println("Result is  " + result);
		} 
//		catch (ArithmeticException e) {
//			System.out.println("cant divide any number by 0");
//		} catch (NumberFormatException e1) {
//			System.out.println("the value expected in number or string.");
//		}                                  
		catch (Exception e) {
			System.out.println("Error :  There is an error.....");
		} finally {
			System.out.println("This is finally block...");
		}
	}

}
