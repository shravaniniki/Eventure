package ExceptionHandling;

public class Finally {

	public static void m1() {
		System.out.println("method m1() STARTED");
		try {
			
		}catch(ArithmeticException exception) {
			System.out.println("catch exception in m1() method: "+ exception.getMessage());
			
		}
		finally {
			System.out.println("finally block executed in m1() method");
		}
		
		System.out.println("method m1() ends");
	}
	public static void m2() {
		System.out.println("method m2() STARTED");
		try {
			
		}catch(ArithmeticException exception) {
			System.out.println("catch exception in m2() method: "+ exception.getMessage());
			
		}
		finally {
			System.out.println("finally block executed in m2() method");
		}
		
		System.out.println("method m2() ends");
	}
	public static void m3() {
		System.out.println("method m3() STARTED");
		try {
			return;
		}catch(ArithmeticException exception) {
			System.out.println("catch exception in m3() method: "+ exception.getMessage());
			
		}
		finally {
			System.out.println("finally block executed in m3() method");
		}
		
		System.out.println("method m3() ends");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		System.out.println("----------------");
		m2();
		System.out.println("----------------");
		m3();
	}

}
