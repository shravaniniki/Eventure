package ExceptionHandling;

class Account{
	private String holderName;
	private static long accountNo =1234555;
	private int balance;
	public Account(String holderName, int balance) {
		super();
		accountNo++;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public String accountInfo() {
		return "Account [ accountNo="+ accountNo+",holderName=" + holderName + ", balance=" + balance + "]";
	}
	
	
}
class InvalidDetailsToOpenAccountException extends RuntimeException{
	private String message;
	public InvalidDetailsToOpenAccountException(String msg) {
		super(msg);
		this.message=msg;
	}
	
	public String toString() {
		return message;
	}
	
	
}

class ABCBank{
	public static String openAccount(String name,int age,int balance) {
		if(age>18 && balance>=1000) {
			return new Account(name,balance).accountInfo();
		}
	
	throw new InvalidDetailsToOpenAccountException("Account cannot be opened");
}
}
public class Custom_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		try {
			String info = ABCBank.openAccount("arun",20,4000);
			System.out.println(info);
		}catch(InvalidDetailsToOpenAccountException e) {
			System.out.println ("Exception is : "+e.getMessage());
		}
		
	}
}
