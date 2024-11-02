package ExceptionHandling;

public class Throw {
	public static void method2(int a,int b) {
		try {
			if(b==0) {
				throw new ArithmeticException("b must be non-zero");
			}
			
			int r=a/b;
			System.out.print("div : "+r);
		}catch(ArithmeticException exception) {
			System.out.println("exception in method2 is: "+ exception.getMessage());
			throw exception;//re-throwing the exception object to the calling method
		}
	}
	public static void method1(int a,int b) {
		try {
			method2(a,b);
		}catch(ArithmeticException exception) {
			System.out.println("exception in method1 is: "+ exception.getMessage());
			throw exception;//re-throwing the exception object to the calling method
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1(10, 0);
		}catch(ArithmeticException exception) {
			System.out.println("exception in main method is : "+ exception.getMessage());
		}
        
	}

}
