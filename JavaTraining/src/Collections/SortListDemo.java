package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ProductSort{
	private int id;
	private String name;
	private double price;
	private String category;
	private int qty;
	private String manufacturer;
	
	public ProductSort(int id, String name, double price, String category, int qty, String manufacturer) {
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
}
public class SortListDemo {

	private static void addStudents(ArrayList<ProductSort> productList) {
		ProductSort p1=new ProductSort(1000 , "fan" , 2500.24 ,"electronics" ,  5 , "Crom");
		ProductSort p2=new ProductSort(1001 , "apple" , 2100.24 ,"electronics" ,  4 , "Crom");
		ProductSort p3=new ProductSort(103 , "orange" , 1500.24 ,"etronics" ,  5 , "Crom");
		ProductSort p4=new ProductSort(1004, "phone" , 2700.24 ,"electronics" ,  3 , "Crom");
		ProductSort p5=new ProductSort(1005 , "Pen" , 2000.24 ,"electrocs" ,  5 , "Crom");
		ProductSort p6=new ProductSort(1002 , "Basket" , 23500.24 ,"electronics" ,  5 , "Crm");
		ProductSort p7=new ProductSort(105 , "Can" , 25040.24 ,"eleconics" ,  5 , "rom");
		ProductSort p8=new ProductSort(1006 , "Laptop" , 25500.24 ,"elecnics" ,  5 , "Com");
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
		productList.add(p6);
		productList.add(p7);
		productList.add(p8);
	}
	public static void sortById(List<ProductSort> num) {
	     List<Integer> id=new ArrayList<Integer>();
	     for(ProductSort n:num) {
	    	 id.add(n.getId());
	     }
	     
		System.out.println(num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		List<ProductSort> productList=new ArrayList<ProductSort>();
		
		
		sortById(productList);
		
	}



}
