package Collections.HashSetDemo;
import java.util.HashSet;

import java.util.Objects;
class Product{
	private int id;
	private String name;
	private double price;
	private String category;
	private int qty;
	private String manufacturer;
	
	public Product(int id, String name, double price, String category, int qty, String manufacturer) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.qty = qty;
		this.manufacturer = manufacturer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String toString() {
	return "Product [id=" + id+", name=" + name +",price="+price+", manufacturer= "+manufacturer+", category= "+category+", qty= "+qty;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, id, manufacturer, name, price, qty);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && id == other.id
				&& Objects.equals(manufacturer, other.manufacturer) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && qty == other.qty;
	}
	
	
}
public class ProductHashSet {

	public static void displayProducts(HashSet<Product> productSet) {
		for(Product product : productSet) {
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1001 , "fan" , 2500.24 ,"electronics" ,  5 , "Crom");
		Product p2=new Product(1002 , "apple" , 2100.24 ,"electronics" ,  4 , "Crom");
		Product p3=new Product(1003 , "orange" , 1500.24 ,"etronics" ,  6 , "Crom");
		Product p4=new Product(1001 , "phone" , 2700.24 ,"electronics" ,  5 , "Crom");
		
		HashSet<Product> productSet=new HashSet<Product>();
		
		
	}

}
