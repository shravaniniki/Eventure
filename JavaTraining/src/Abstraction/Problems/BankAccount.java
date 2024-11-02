package Abstraction.Problems;

abstract class Account {
	static int balance;
	int accNo;
	
    public Account(int balance, int accNo) {
		super();
		this.balance = balance;
		this.accNo = accNo;
	}

	void deposit(double amount) {
    	balance+=amount;
    	System.out.println("Amount of "+amount+"is deposited");
    }

    void withdraw(double amount) {
    	balance-=amount;
    	System.out.println("Amount of "+amount+"is withdrawn");
    }

    void displayBalance() {
    	System.out.println("Balance: "+balance);
    }
}

class SavingsAccount extends Account {
	String name;
	public SavingsAccount(int balance,int accNo,String name) {
		super(balance,accNo);
		this.name = name;
	}

	void deposit(double amount) {
		super.deposit(amount);
	}
	void withdraw(double amount) {
		super.withdraw(amount);
	}
}

class CheckingAccount extends Account {
	String name;
	public CheckingAccount(int balance,int accNo,String name) {
		super(balance,accNo);
		this.name = name;
	}


	void deposit(double amount) {
		super.displayBalance();
	}
}


public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sav=new SavingsAccount(10000,234555,"rtrew");
		CheckingAccount check=new CheckingAccount(10000,234555,"rtrew");
		
		sav.deposit(100);
		check.displayBalance();
		sav.withdraw(200);
		check.displayBalance();
	}

}
