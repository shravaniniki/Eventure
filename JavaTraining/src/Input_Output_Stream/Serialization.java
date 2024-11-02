package Input_Output_Stream;

import java.io.*;

class Product implements Serializable{
	
	private static final long serialVersionUID = -98667680;
	
	private int id;
	private String name;
	private double price;
	private transient int qty;
	//apply transient if you do not want the field to be serialized
	public Product(int id, String name, double price, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
	
}
public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\SR166\\Desktop\\JavaTraining\\Workout_Problems\\gold.txt");
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file))){
		Product product = new Product(1001,"fan",4500.34,12);
		
		oos.writeObject(product);
		System.out.println("product object is serialized");
		}catch(Exception e) {
			System.out.println("exception is: "+e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

}
