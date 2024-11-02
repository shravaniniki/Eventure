package Collections.HashSetDemo;

class CustomStack{
	int[] arr;
	
	int top=-1;
	public void push(int num) {
		top++;
		arr[top]=num;
	}
	
	public void pop(int num) {
		System.out.println(arr[top]);
		top--;
	}
	
	public void peek() {
		System.out.println(arr[top]);
	}
	

}
public class StackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomStack stack=new CustomStack();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		
		stack.pop(300);
	}

}
