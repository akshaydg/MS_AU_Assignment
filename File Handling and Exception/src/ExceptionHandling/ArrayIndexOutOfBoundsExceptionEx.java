package ExceptionHandling;



public class ArrayIndexOutOfBoundsExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr=new Integer[5];

		try {
			System.out.print(arr[10]);
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}

    }
}
