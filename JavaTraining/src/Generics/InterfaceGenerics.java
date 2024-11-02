package Generics;

interface Trainable<T>{
	public void train(T t);
}

class Trainer{
	private int rollNo;
	private String name;
	public Trainer(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "rollNo=" + this.rollNo + ", name=" + this.name;
	}
	
}

class ITTrainer extends Trainer implements Trainable<ITStudent>{
	private String techStack;

	public ITTrainer(int rollNo,String name,String techStack) {
		super(rollNo,name);
		this.techStack = techStack;
	}
	
	public String toString() {
		return super.toString()+" "+this.techStack;
	}
	
	public void train(ITStudent st) {
		System.out.println("Trainer is delevering techstack to : "+st);
	}
	
}
class NonITTrainer extends Trainer implements Trainable<NonITStudent>{
	private String projectStack;

	public NonITTrainer(int rollNo,String name,String projectStack) {
		super(rollNo,name);
		this.projectStack = projectStack;
	}
	
	public String toString() {
		return super.toString()+" "+this.projectStack;
	}
	
	public void train(NonITStudent st) {
		System.out.println("Trainer is delevering techstack to : "+st);
	}
}
class Student{
	private int rollNo;
	private String name;
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
}
class ITStudent extends Student{
    private String course;
    
	public ITStudent(int rollNo, String name,String course) {
		super(rollNo,name);
		this.course=course;
	}
	
}
class NonITStudent extends Student{
	  private String project;
	  
		public NonITStudent(int rollNo, String name,String project) {
			super(rollNo,name);
			this.project=project;
		}
		
}
public class InterfaceGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITTrainer itTrainer= new ITTrainer(1001,"Arun","Java FSD");
		itTrainer.train(new ITStudent(101,"Vishal","Java"));
		
		NonITTrainer nonItTrainer= new NonITTrainer(1005,"Aruna","Design project");
		nonItTrainer.train(new NonITStudent(102,"Vishalini","Designing"));
	}

}
