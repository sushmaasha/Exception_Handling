package exception;

public class exception {

	public static void main(String[] args) {
 int[] a= {1,2,3};
		try {
			System.out.println(5/0);
		}

		catch (ArithmeticException e) {
			System.out.println("i am inside catch");
			e.printStackTrace();
			System.out.println("i am going out of catch");
		}
		
		catch (Exception e) {
			System.out.println("can't divide by zero");
			e.printStackTrace();
		}
		
		
		try {
			System.out.println("im inside try");
			System.out.println(a[5]);
			System.out.println("going out of try catch");
		}

		catch(IndexOutOfBoundsException e)
		{
			System.out.println("inside catch");
			e.printStackTrace();
			System.out.println("going out of catch");
			
		}finally {
			System.out.println("going out of try catch");
		}
	}

}