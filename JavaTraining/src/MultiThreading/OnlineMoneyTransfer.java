package MultiThreading;

class NEFTService extends Thread{

	private double amount;
	private Account accNo;
	private Account otherAccountNo;

	public NEFTService(Account accNo, double amount,Account otherAcc) {
		super();
		this.accNo = accNo;
		this.amount = amount;
		this.otherAccountNo=otherAcc;
	}
	public double processMoneyTransfer(Account accNo,Account otherAccountNo,double amount) {
		amount-=amount;
		System.out.println("Amount of "+amount+" is transfered from "+accNo+" to "+otherAccountNo+" account");
		return amount;
	}
	public void displayDetails(Account accNo2,double smount) {
		System.out.println("Details : "+accNo2+" balance: "+smount+" ");
	}
	
	public void run() {
	try {
		double amountBalance=processMoneyTransfer(accNo,otherAccountNo,amount);
		Thread.sleep(1000);
		displayDetails(accNo,amountBalance);
		Thread.sleep(300);
	}catch(Exception e) {
		System.out.println("Exception is: "+e.getMessage());
		e.printStackTrace();
	}
	}
}

class Account {
	private long accNo;
	private double amount;
	public Account(long accNo, double amount) {
		super();
		this.accNo = accNo;
		this.amount = amount;
	}
	
}
public class OnlineMoneyTransfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
