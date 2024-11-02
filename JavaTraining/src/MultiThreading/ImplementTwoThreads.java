package MultiThreading;

class Thread1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread 1 runs...");
		for(int i=1;i<=10;i++) {
			System.out.println(i+"-- Thread 1");
		try {
			Thread.sleep(200);
		}catch(InterruptedException e) {
			System.out.println("exception is: "+ e.getMessage());
		}
	}
	}
	
}

class Thread2 extends Thread{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread 2 runs...");
		for(int i=10;i>=1;i--) {
			System.out.println(i+"-- Thread 2");
		try {
			Thread.sleep(200);
		}catch(InterruptedException e) {
			System.out.println("exception is: "+ e.getMessage());
		}
		}
	}
	
}
public class ImplementTwoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1();
		t1.setPriority(7);
		Thread2 t2=new Thread2();
		t2.setPriority(10);
		t1.start();
		t2.start();
	}

}
