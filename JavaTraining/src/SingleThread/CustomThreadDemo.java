package SingleThread;

/* Custom thread creation by extending thread class:-
 * a) create a class and inherit from thread class.
 * b) override run() method and write the logic need to be executed by thread.
 * c) create an object for the class and that will become a thread object.
 * d) invoke start() method using object (created in previous step).
 * e) then run() method is invoked by thread automatically.
 */

class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("number is: "+i);
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
public class CustomThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread obj = new MyThread();	
		obj.start();
	}

}
