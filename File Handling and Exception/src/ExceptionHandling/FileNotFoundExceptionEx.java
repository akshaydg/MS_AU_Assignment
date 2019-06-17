package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileInputStream fis = new FileInputStream("abc.txt");
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
