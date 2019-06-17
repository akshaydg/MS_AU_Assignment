package ExceptionHandling;

public class ArithmaticExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a=12/0;

		}catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}
