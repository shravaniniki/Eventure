package Inheritance;


import java.util.Scanner;

class BankAccount{
	private int accNo;
	private String accHolder;
	private int accBalance;
	//setter
	public void setAccNo(int accountNo) {
		accNo=accountNo;
	}
	public void setAccHolder(String accountHolder) {
	     accHolder=accountHolder;
	}
	public void setAccBalance(int accountBalance) {
		accBalance=accountBalance;
	}
	//getter
	public int getAccNo() {
		return accNo;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public int getAccBalance() {
		return accBalance;
	}
	
	//operations
	//deposit
	public int deposit(int amount) {
	    accBalance+=amount;
		return this.accBalance;
	}
	
	//withdraw
	public int withdraw(int amount) {
		accBalance-=amount;
		return this.accBalance;
	}
	
	//checkBalance
	
	public int checkBalance() {
		return accBalance;
	}
	
	//transfer
	public void amtTransfer(int amountTotransfer,int accNo) {
		if(accBalance>amountTotransfer) {
			accBalance=accBalance-amountTotransfer;
			System.out.print("\n"+amountTotransfer+"transferrred to account"+ accNo);
	}else {
		System.out.print("\nAmount is not sufficient");
	}
		
	}
	public void checkInfo(String accHolder2, int accNo2) {
		System.out.println("\nAccount holder name : "+accHolder2);
		System.out.println("\nAccount number : "+accNo2);
		System.out.println("\nBalance : "+checkBalance());
		// TODO Auto-generated method stub
		
	}

}
public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1=new BankAccount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account no: ");
		int accNo=sc.nextInt();
		System.out.println("\nSelect from the options below---\n");
		System.out.print("1. Check Info\n");
		System.out.print("2. Check Balance\n");
		System.out.print("3. Withdraw Money\n");
		System.out.print("4. Deposit Money\n");
		System.out.print("5. TransferMoney\n");
		System.out.print("6. Exit\n");
		int options=sc.nextInt();
		switch(options){
			case 1:
				System.out.print("Enter Holder name");
				String accHolder = sc.nextLine();
				b1.checkInfo(accHolder,accNo);
				break;
			case 2:
				b1.checkBalance();
				break;
			case 3:
				System.out.print("\nEnter the withdraw money:");
				int money=sc.nextInt();
				b1.withdraw(money);
				break;
			case 4:
				System.out.print("\nEnter deposit money:");
				int amount=sc.nextInt();
				b1.deposit(amount);
				break;
			case 5:
				System.out.print("\nEnter acc no you want to transfer");
				int accT=sc.nextInt();
				System.out.print("\nEnter the amount you want to transfer:");
				int amt=sc.nextInt();
				b1.amtTransfer(amt,accT);
				break;
			case 6:
				break;
		}
		
		
	}

}

