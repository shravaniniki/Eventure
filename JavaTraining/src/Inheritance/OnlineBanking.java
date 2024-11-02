package Inheritance;

class Account {
    long accountNumber;
    double balance;
    String accountHolder;

    Account(long accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(long accountNumber, double balance, String accountHolder) {
		super(accountNumber, balance, accountHolder);
		// TODO Auto-generated constructor stub
	}

	// Specific features for savings account
	
    void calculateInterest() {
        // Implementation...
    	double Interest = 1000*this.balance;
    }
}

class CurrentAccount extends Account {
    CurrentAccount(long accountNumber, double balance, String accountHolder) {
		super(accountNumber, balance, accountHolder);
		// TODO Auto-generated constructor stub
	}

	// Specific features for current account
    void handleOverdraft() {
        // Implementation...
    	
    }
}

public class OnlineBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SavingsAccount savingsAccount = new SavingsAccount(123456, 1000.0, "John Doe");
	CurrentAccount currentAccount = new CurrentAccount(789012, 2000.0, "Jane Smith");


	}

}
