package SingleThread;

/* Creation of custom thread by implementing Runnable Interface:-
 * interface : java.lang.Runnable
 * method : public void run();
 * class : jang.lang.Thread
 * 
 * a) create a class and implement from Runnable interface
 * b) override run() method and put your logic in it to be executed by thread
 * c) create an object for your class(so that it will become Runnable object)
 * d) create a Thread object by passing the runnable object as argument to the Thread class concstructor
 * e) invoke start() method on the Thread Object
 */

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<20;i++) {
			if(i%2==0) {
				System.out.println("even num is: "+i);
			}
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				System.out.println("exception is: "+ e.getMessage());
			}
		}
	}
	
}
public class CustomThreadImplementsRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyRunnable runnable=new MyRunnable();
		//or
		//using lambda expression without using the above class implementation
		
		/*Runnable runnable =()->{
		 * for(int i=1;i<20;i++) {
			if(i%2==0) {
				System.out.println("even num is: "+i);
			}
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				System.out.println("exception is: "+ e.getMessage());
			}
		 */
		Thread t=new Thread(runnable);
		t.start();
	}

}
