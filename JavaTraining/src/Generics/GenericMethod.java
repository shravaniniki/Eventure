package Generics;

class NonGenericClass{
	public <T> void displayElements(T[] t) {
		for(T ele:t) {
			System.out.println("element is: "+ele);

		}
		
		System.out.println("-----------------");
	}
}
public class GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonGenericClass obj=new NonGenericClass();
		
		Integer[] intArr= {1,2,3,4,5};
		obj.displayElements(intArr);
		
		Double[] doubleArr= {1.1,2.2,3.3,4.4,5.5};
		obj.displayElements(doubleArr);
	}

}
