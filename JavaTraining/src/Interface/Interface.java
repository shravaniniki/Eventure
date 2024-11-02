package Interface;

interface Vehicle{
	public abstract void start();
	public abstract void move();
	public void stop();
	
}

class Car1 implements Vehicle{
	
	public void start() {
		System.out.println("Car strats...");
	}
	
	public void move() {
		System.out.println("Car moves...");
	}
	
	public void stop() {
		System.out.println("Car stops...");
	}
	
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we cannot create object for vehicle interface but we use it as reference and create objectss for other classes
		
		Vehicle vehicle;
		
		vehicle= new Car1();
		vehicle.move();

	}

}
