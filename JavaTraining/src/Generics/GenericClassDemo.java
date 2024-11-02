package Generics;

class MyClass<T>{
	T t;
	public MyClass(T t) {
		this.t=t;
	}
	public T getElement() {
		return this.t;
	}
    public void displayType() {
        // Display the type of the object
        if (t != null) {
            System.out.println("Type of object: " + t.getClass().getSimpleName());
        } else {
            System.out.println("Box is empty.");
        }
    }

    public boolean isEmpty() {
        // Check if the box is empty
    	if(this.t==null) {
    		return false; 
    	}
    	return true;
        // Placeholder, replace with actual implementation
    }

}
public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass<Integer> num= new MyClass<Integer>(100);
		System.out.println("integer is : "+num.getElement());
		System.out.println(num.isEmpty());
		num.displayType();
	}

}
