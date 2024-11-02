package ExceptionHandling.Problems;

import java.util.Scanner;

class AgeValidation{
	public static void validation(int age) {
		if(age>0 && age<=150) {
			System.out.println("Age is accepted");
		}else{throw new InvalidAgeCustomException("Age must be between 0 and 150");
		}
	}
}
class InvalidAgeCustomException extends RuntimeException{
	private String message;
	public InvalidAgeCustomException(String msg) {
		super(msg);
		this.message=msg;
	}
	
	public String toString() {
		return message;
	}
	
	
}
public class Custom_age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
	
		
		try {
			AgeValidation.validation(age);
		}catch(InvalidAgeCustomException e) {
			System.out.println("Exception "+e.getMessage());
		}
	}

}
