package ExceptionHandling;

import java.io.IOException;
//checked exception does not automatically call the calling objects
public class Throws {

	public static void m3() throws IOException{
		throw new IOException("Just checking un-checked exception");
	}
    public static void m2() throws IOException {
		m3();
	}
    public static void m1() throws IOException{
	    m2();
    }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			m1();
		}catch(IOException exception) { 
			System.out.println("Exception propagated is : "+exception.getMessage());
		}
		
}
}