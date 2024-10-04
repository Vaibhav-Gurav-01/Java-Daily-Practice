package exception;

public class ArrayException {

	public static void main(String[] args) {
//		int[] arr = new int[5];

		try {
			int[] arr = { 10, 20, 30, 40, 50 };
			System.out.println("length : " + arr.length);
			System.out.println(arr[10]);
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

	}

}
