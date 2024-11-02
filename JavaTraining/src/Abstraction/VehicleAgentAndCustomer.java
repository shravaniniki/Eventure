package Abstraction;

interface IVehicle {

	public void start();

	public void travel(String from, String to);

	public void stop();
}

abstract class AbstractVehicle implements IVehicle {

	private int vehicleNo;
	private long speedoMeter;

	public AbstractVehicle(int vehicleNo, long speedoMeter) {
		this.setVehicleNo(vehicleNo);
		this.setSpeedoMeter(speedoMeter);
	}

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public long getSpeedoMeter() {
		return speedoMeter;
	}

	public void setSpeedoMeter(long speedoMeter) {
		this.speedoMeter = speedoMeter;
	}

}

class Bike extends AbstractVehicle {

	public Bike(int vehicleNo, long speedoMeter) {
		super(vehicleNo, speedoMeter);
	}

	@Override
	public void start() {
		System.out.println("Bike started");

	}

	@Override
	public void travel(String from, String to) {

		System.out.println("travelling on bike from " + from + " to " + to);
	}

	@Override
	public void stop() {
		System.out.println("Bike stopped");

	}

}

class Car extends AbstractVehicle {

	public Car(int vehicleNo, long speedoMeter) {
		super(vehicleNo, speedoMeter);
	}

	@Override
	public void start() {
		System.out.println("Car started");

	}

	@Override
	public void travel(String from, String to) {

		System.out.println("travelling on car from " + from + " to " + to);
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");

	}
}

class Bus extends AbstractVehicle {

	public Bus(int vehicleNo, long speedoMeter) {
		super(vehicleNo, speedoMeter);
	}

	@Override
	public void start() {
		System.out.println("Bus started");

	}

	@Override
	public void travel(String from, String to) {

		System.out.println("travelling on bus from " + from + " to " + to);
	}

	@Override
	public void stop() {
		System.out.println("Bus stopped");

	}
}

class VehicleAgent {

	static IVehicle vehicles[] = new IVehicle[7];
	static IVehicle customerVehicles[] = new IVehicle[7];
	static int customerVehicleCounter = 0;
	static {

		Bike b1 = new Bike(123, 1000);
		Bike b2 = new Bike(124, 1000);
		Bike b3 = new Bike(125, 1000);

		Car c1 = new Car(1234, 2000);
		Car c2 = new Car(1235, 2500);

		Bus bus1 = new Bus(12345, 12000);
		Bus bus2 = new Bus(12346, 14000);

		vehicles[0] = b1;
		vehicles[1] = b2;
		vehicles[2] = b3;
		vehicles[3] = c1;
		vehicles[4] = c2;
		vehicles[5] = bus1;
		vehicles[6] = bus2;

	}

	public IVehicle getVehicle(String name) {

		for (int i = 0; i < vehicles.length; i++) {
			if (name.equalsIgnoreCase("bike")) {

				if (vehicles[i] instanceof Bike) {
					IVehicle v = vehicles[i];
					customerVehicles[customerVehicleCounter++] = vehicles[i];
					vehicles[i] = null;
					return v;
				}
			} else if (name.equals("car")) {
				if (vehicles[i] instanceof Car) {
					IVehicle v = vehicles[i];
					customerVehicles[customerVehicleCounter++] = vehicles[i];
					vehicles[i] = null;
					return v;
				}

			} else if (name.equals("bus")) {
				if (vehicles[i] instanceof Bus) {
					IVehicle v = vehicles[i];
					customerVehicles[customerVehicleCounter++] = vehicles[i];
					vehicles[i] = null;
					return v;
				}
			}

		}

		return null;
	}

	public boolean returnVehicle(IVehicle vehicle) {
		return true;
	}

}

class VehicleServiceCenter {

	
	
	
}

public class VehicleAgentAndCustomer {

	public static void main(String[] args) {

		VehicleAgent vehicleAgent = new VehicleAgent();
		Bike bike = (Bike) vehicleAgent.getVehicle("Bike");

		bike.start();
		bike.travel("chennai", "coimbatore");
		bike.stop();

		Car car = (Car) vehicleAgent.getVehicle("car");
		car.start();
		car.travel("coimbatore", "madhurai");
		car.stop();

	}

}