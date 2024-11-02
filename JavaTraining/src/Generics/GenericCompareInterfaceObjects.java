//package Generics;
//
//import java.util.ArrayList;
//import java.util.List;
//
//interface MyComparable<T,U>{
//	public boolean areSame(T t,U u);
//}
//
//class Product{
//	private String name;
//	private int id;
//	private double price;
//	public Product( int id,String name, double price) {
//		this.name = name;
//		this.id = id;
//		this.price = price;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	@Override
//	public String toString() {
//		return "Product [name=" + name + ", id=" + id + ", price=" + price + "]";
//	}
//	
//	
//}
//
//class ProductComparable implements MyComparable<Product,Product>{
//	public boolean areSame(Product t,Product u) {
//		if(t.getId()==u.getId()) {
//			if(t.getName().equals(u.getName())) {
//				if(t.getPrice()==u.getPrice()) {
//					return true;
//				}
//			}
//		}
//		
//		return false;
//	}
//}
//
//public class GenericCompareInterfaceObjects {
//	public static boolean areAllUniqueProducts(List<Product> productList) {
//		ProductComparable pc=new ProductComparable();
//		for(int i=0;i<productList.size();i++) {
//			for(int j=i+1;j<productList.size();j++) {
//				if(pc.areSame(productList.get(i),productList.get(j))) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}
//   public static void main(String[] args) {
//	   Product p1= new Product(100,"fan",4500.25);
//	   Product p2= new Product(200,"laptop",54434.56);
//	   Product p3= new Product(900,"fan",4500.25);
//	   
//	   List<Product> productList=new ArrayList<>();
//	   productList.add(p1);
//	   productList.add(p2);
//	   productList.add(p3);
//	   
//	   if(areAllUniqueProducts(productList)) {
//		   System.out.println("List has unique elements");
//	   }else {
//		   System.out.println("List has duplicate elements"); 
//	   }
//   }
//}
