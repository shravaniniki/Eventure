package Encapsulation;

class Student {
    private String name;
    private int studentId;
    private int[] grades;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int[] getGrades() {
		return grades;
	}
	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	public Student(String name, int studentId, int[] grades) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.grades = grades;
	}

    // Calculate average grade method
	public void averageMarks(int[] grades) {
		int avg=0;
		int total=0;
		for(int i=0;i<grades.length;i++) {
			total+=grades[i];
		}
		avg=total/grades.length;
		System.out.println("The average marks of a student named "+getName()+" with ID "+getStudentId()+" is "+avg);
	}
}


public class StudentGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] grades= {34,67,89,45,78};
		Student st=new Student("Peter",25,grades);
		st.averageMarks(grades);
	}

}
