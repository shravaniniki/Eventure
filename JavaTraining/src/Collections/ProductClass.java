package Collections;
import java.util.*;



class Product{
	public int id;
	public String name;
	public double price;
	public String category;
	public int qty;
	public String manufacturer;
	public Product(int id, String name, double price, String category, int qty, String manufacturer) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.qty = qty;
		this.manufacturer = manufacturer;
	}
	
	public void basedOnProductLength(List<Product> p) {
		for(int i=0;i<p.size();i++) {
			if(p.get(i).name.length()==3 || p.get(i).name.length()==5) {
				System.out.println("Product names whose length is 3 or 5 : "+p.get(i).name);
			}
		}
	}
	
	public void totalPriceOfCategory(List<Product> p,String categoryType) {
		double totalPrice = 0;
		for(int i=0;i<p.size();i++) {
			if(p.get(i).category==categoryType) {
				totalPrice+=p.get(i).price;
			}
		}
		System.out.println("Price of a given Category " +categoryType+" is "+totalPrice);

	}
	
	public void productsBasedOnCategory(List<Product> p,String categoryType) {
		for(int i=0;i<p.size();i++) {
			if(p.get(i).category==categoryType) {
			System.out.println(p.get(i).name);

			}
		}
	}
	
	public void productsPriceRange(List<Product> p,int stAmount,int lsAmount) {
		for(int i=0;i<p.size();i++) {
			if(p.get(i).price>=stAmount && p.get(i).price<=lsAmount) {
			System.out.println(p.get(i).name);

			}
		}
		
	}
	
	public void productQtyBasedOnManufacturers(List<Product> p,String Manufacturer) {
		for(int i=0;i<p.size();i++) {
			if(p.get(i).manufacturer==Manufacturer) {
			System.out.println(p.get(i).qty);

			}
		}
	}
}
public class ProductClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1=new Product(1000 , "fan" , 2500.24 ,"electronics" ,  5 , "Crom");
		Product p2=new Product(1000 , "apple" , 2100.24 ,"electronics" ,  4 , "Crom");
		Product p3=new Product(1000 , "orange" , 1500.24 ,"etronics" ,  5 , "Crom");
		Product p4=new Product(1000 , "phone" , 2700.24 ,"electronics" ,  3 , "Crom");
		Product p5=new Product(1000 , "Pen" , 2000.24 ,"electrocs" ,  5 , "Crom");
		Product p6=new Product(1000 , "Basket" , 23500.24 ,"electronics" ,  5 , "Crm");
		Product p7=new Product(1000 , "Can" , 25040.24 ,"eleconics" ,  5 , "rom");
		Product p8=new Product(1000 , "Laptop" , 25500.24 ,"elecnics" ,  5 , "Com");
		
		List<Product> pro=new ArrayList<Product>();
		pro.add(p1);
		pro.add(p2);
		pro.add(p3);
		pro.add(p4);
		pro.add(p5);
		pro.add(p6);
		pro.add(p7);
		pro.add(p8);
		 
		System.out.println("------Print the products whose name has 3 or 5 in length------");
	    p1.basedOnProductLength(pro);
	    
	    System.out.println("\n------Print the total product price of a given category------");
	    p1.totalPriceOfCategory(pro,"electronics");
	    
	    System.out.println("\n------Print the product name of a given category------");
	    p1.productsBasedOnCategory(pro,"electronics");

	    System.out.println("\n------Print the list of products based on given price range-----");
	    p1.productsPriceRange(pro,1000,20000);
	    
	    System.out.println("\n------Print the list of products quantities based on given manufacturer-----");
	    p1.productQtyBasedOnManufacturers(pro, "Crom");
	}
}
