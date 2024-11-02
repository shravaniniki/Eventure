
interface Vehicle{

}
class VehicleAgent{
	private int noOfVehicles;
	private Vehicle vehicleName[];
	private int countOfVehicles[];
	
	
	public VehicleAgent(int noOfVehicles, Vehicle[] vehicleName, int[] countOfVehicles) {
		super();
		this.noOfVehicles = noOfVehicles;
		this.vehicleName = vehicleName;
		this.countOfVehicles = countOfVehicles;
	}
	
	public Vehicle[] getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(Vehicle[] vehicleName) {
		this.vehicleName = vehicleName;
	}
	public int[] getCountOfVehicles() {
		return countOfVehicles;
	}
	public void setCountOfVehicles(int countOfVehicles[]) {
		this.countOfVehicles = countOfVehicles;
	}
	public int getNoOfVehicles() {
		return noOfVehicles;
	}
	public void setNoOfVehicles(int noOfVehicles) {
		this.noOfVehicles = noOfVehicles;
	}
	
	
}
class Car {
	
}
class Bike{
	
}
class Bus{
	
}
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	}

}
