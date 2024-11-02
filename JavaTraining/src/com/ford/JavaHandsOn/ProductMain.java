package com.ford.JavaHandsOn;

//ArrayDemo

class Product{
	private int id;
	private String name;
	private double price;
	private String category;
	private String seller;
	private int qty;
	
	public Product(int id, String name, double price, String category, String seller, int qty) {
		// TODO Auto-generated constructor stub
		this.setId(id);
		this.setCategory(category);
		this.setName(name);
		this.setPrice(price);
		this.setQty(qty);
		this.setSeller(seller);
	}
	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	
}
public class ProductMain {
	
	public static void displayProduct(Product[] p) {
    	for(int i=0;i<p.length;i++) {
			System.out.println(p[i].getId()+"+"+p[i].getName()+"+"+p[i].getPrice()+p[i].getQty()+"+"+p[i].getSeller()+"+"+p[i].getCategory());
		}
		
	}
	public static int categoryCount(Product[] p,String Category) {
		int count=0;
	      for(Product pro:p) {
	    	  if(pro.getCategory().equals(Category)) {
	    		  count++;
	    	  }
	      }
	      return count;
	}
	public static int pricebycategory(Product[] p,String Category) {
		int price=0;
	      for(Product pro:p) {
	    	  if(pro.getCategory().equals(Category)) {
	    		  price+=pro.getPrice();
	    	  }
	      }
	      return price;
	}
	public static void sellerName(Product[] product,String sellerName) {
		
	        for (Product p : product) {
	            if (p.getSeller().equalsIgnoreCase(sellerName)) {
	                System.out.println(p.getId()+"+"+p.getName()+"+"+p.getPrice()+p.getQty()+"+"+p.getSeller()+"+"+p.getCategory());
	            }
	        }
	     
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(101,"Pencil",23.00,"Stationary","regular",3);
		Product p2=new Product(102,"Table",10000.00,"Furniture","regular",1);
		Product p3=new Product(103,"Pen",23.00,"Stationary","regular",3);
		Product p4=new Product(104,"Pencil",23.00,"Stationary","rare",3);
		Product p5=new Product(105,"Sofa",20000.00,"Furniture","regular",1);
		Product p6=new Product(106,"Pan",1500.00,"Vessel","regular",2);
		Product p7=new Product(107,"Pencil",23.00,"Stationary","rare",3);
		Product p8=new Product(108,"Pencil",23.00,"Stationary","regular",3);
		
		Product[] prodArray=new Product[]{p1,p2,p3,p4,p5,p6,p7,p8};
		System.out.println("Display all the products---");
		displayProduct(prodArray);
		System.out.println("Products count based on the given Category---");
		System.out.println(categoryCount(prodArray,"Furniture"));
		System.out.println("Products based on the given seller name---");
	    sellerName(prodArray,"rare");
	
	
		
	}

}
