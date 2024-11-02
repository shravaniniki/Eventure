package Java8.FunctionInterface;

import java.util.function.BiConsumer;

class Employee{
     private int empId;
     private String name;
     private String designation;
     private double salary;
	public Employee(int empId, String name, String designation, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
     
}

class Project{
	private int projectId;
	private String projectName;
	private String domainName;
	public Project(int projectId, String projectName, String domainName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.domainName = domainName;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	
}
public class BiConsumerPrb {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiConsumer<Employee,Project> display=(emp,prj)->{
		System.out.println(emp.getEmpId()+" "+emp.getName()+" "+emp.getDesignation()+" "+emp.getSalary());
	};
	Employee emp=new Employee(122,"Henn","engineer",34455.66);
	Project prj = new Project(234,"Application","AIML");
		
		display.accept(emp, prj);
		
		

	}

}
