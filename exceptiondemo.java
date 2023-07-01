package exception;

public class exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 3, 5, 7 };
		try {
			System.out.println(1 / 1);
			System.out.println(a[5]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("out of index");
		}

		catch (ArithmeticException e) {
			System.out.println("im inside the catch");
			e.printStackTrace();
		}

		catch (Exception e) {
			System.out.println("array element is not defined");
			e.printStackTrace();
		} finally {
			System.out.println("it is exception handling concept");
		}
	}
}
