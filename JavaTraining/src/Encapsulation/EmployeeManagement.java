package Encapsulation;

class Employee {
    private String name;
    private int employeeId;
    private double salary;
    
	public Employee(String name, int employeeId, double salary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    public void giveSalaryRaise(double salaryRaise) {
    	if(salaryRaise > this.salary ) {
    		this.salary+=salaryRaise;
    		System.out.print("Salary has been raised!!!");
    	}
    }

}

public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("John", 9876, 50000.0);
		employee.giveSalaryRaise(55000.0);

	}

}
