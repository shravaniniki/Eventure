package Abstraction.Problems;

abstract class Employee {
    String name;
    int employeeId;
    double monthlySalary;
    public Employee(String name, int employeeId, double monthlySalary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.monthlySalary = monthlySalary;
	}
	abstract double calculateAnnualSalary();
	
	public void displaySalary() {
    System.out.println("Employee [name=" + name + ", employeeId=" + employeeId + ", monthlySalary=" + monthlySalary
				+ ", calculateAnnualSalary()=" + calculateAnnualSalary() + "]");
	}
	
}

class Manager extends Employee {

	public Manager(String name,int employeeId,double monthlySalary) {
		super(name,employeeId,monthlySalary);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateAnnualSalary() {
		// TODO Auto-generated method stub
		double anualSalary=monthlySalary*12;
		return anualSalary;
	}
	
}

class Developer extends Employee {

	public Developer(String name, int employeeId, double monthlySalary) {
		super(name, employeeId, monthlySalary);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateAnnualSalary() {
		// TODO Auto-generated method stub
		double anualSalary=monthlySalary*12;
		
		return anualSalary;
	}
}

public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mg=new Manager("Kiran",123,80000.89);
		Developer dev=new Developer("Sjdd",234,78666.55);
		mg.displaySalary();
		dev.displaySalary();
	}

}
