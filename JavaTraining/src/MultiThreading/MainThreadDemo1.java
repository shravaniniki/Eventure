package MultiThreading;

public class MainThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread currentThread=Thread.currentThread();
		System.out.println("Current thread is:"+currentThread);
		System.out.println("Current thread id:"+currentThread.getId());
		System.out.println("Current thread name: "+currentThread.getName());
		System.out.println("Current thread priority: "+currentThread.getPriority());
		System.out.println("Current Thread group: "+currentThread.getThreadGroup().getName());
		
		System.out.println("Active threads in current group: "+currentThread.getThreadGroup().activeCount());
		
		currentThread.setPriority(10);
		System.out.println("new Thread name"+currentThread.getName());
		System.out.println("Current thread priority: "+currentThread.getPriority());
		System.out.println("Current Thread group: "+currentThread.getThreadGroup().getName());		
	}

}
