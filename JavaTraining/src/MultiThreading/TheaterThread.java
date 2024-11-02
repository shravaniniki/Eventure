package MultiThreading;

class Theater extends Thread{
	String name;
	private static int ticketNo=9393;
	
	public Theater(String name) {
		super();
		this.name = name;
		
	}

	public int issueTicket(String name) {
		System.out.println("Ticket has been issued to "+name+" ticket no id: "+ticketNo);
		return ticketNo++;
	}
	
	public void cutTicket(String name,int ticket) {
		System.out.println("Ticket has been checked for "+name);
	}
	
	public void findSeat(String name,int ticket) {
		System.out.println(name+" has got the seat "+ticket);
	}
	
	public void run() {
		
		try {
			int ticket=issueTicket(this.name);
			Thread.sleep(120);
			cutTicket(this.name,ticket);
			Thread.sleep(100);
			findSeat(this.name,ticket);
			System.out.println("--------------------------------");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

public class TheaterThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] persons= {"hui","jhvg","koii","jhjdhv","eur","njdv","eir"};
		for(String str:persons) {
			Theater t=new Theater(str);
			t.run();
		}
		
		
	}

}
