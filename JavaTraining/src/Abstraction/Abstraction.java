package Abstraction;

abstract class SBIBank{
	private String branch;
	private String regNo;
	private String location;
	public SBIBank(String branch, String regNo, String location) {
		super();
		this.branch = branch;
		this.regNo = regNo;
		this.location = location;
	}
	
	public abstract double findInterest(double amount);
	
	public String bankInfo() {
		return this.branch+" "+this.location+" "+this.regNo;
		}

}

class SBHBank extends SBIBank{

	public SBHBank(String branch, String regNo, String location) {
		super(branch, regNo, location);
		// TODO Auto-generated constructor stub
	}
	public double findInterest(double amount) {
		if(amount<1000) {
			return 0.0;
		}else if(amount>=1000 && amount<=20000) {
			return 2.3;
		}else {
			return 6.0;
		}
	}
}

class SBCBank extends SBIBank{

	public SBCBank(String branch, String regNo, String location) {
		super(branch, regNo, location);
		// TODO Auto-generated constructor stub
	}
	
	public double findInterest(double amount) {
	if(amount<10000) {
		return 0.0;
	}else if(amount>=10000 && amount<=200000) {
		return 3.9;
	}else {
		return 8.0;
	}
}
	
	
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBCBank bank = new SBCBank("SBC001","12443","Pallavaram");
		System.out.println(bank.bankInfo());
		
		double roi = bank.findInterest(84474);
		System.out.println("roi(rate of interest) is: "+roi);
		
	
		
	}

}
