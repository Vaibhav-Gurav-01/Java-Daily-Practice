package exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CheckExceptionDemo {

	public static void main(String[] args) throws IOException {
		
		try {
		FileInputStream file = new FileInputStream("D:\\Vaibhav\\myFile.txt");

		int k;
		//read() method use to read each 
		while ((k = file.read()) != -1) {  //to check till the End of the File 
			System.out.print((char) k);  // typecast of k , so it will not show ascii value
		}
		file.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Error : Invalid File Path ! Enter Valid path");
		}

	}  

}
