//package Interface.Problems;
//
//import java.util.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//interface Product {
//    double calculatePrice();
//}
//
//interface ShoppingCart {
//    void addToCart(Product product);
//    double calculateTotalPrice();
//}
//
//class ElectronicProduct implements Product {
//    private String name;
//    private double price;
//
//    public ElectronicProduct(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    @Override
//    public double calculatePrice() {
//        return price;
//    }
//
//    @Override
//    public String toString() {
//        return "ElectronicProduct{" +
//               "name='" + name + '\'' +
//               ", price=" + price +
//               '}';
//    }
//}
//
//class ClothingProduct implements Product {
//    private String name;
//    private double price;
//    private double discount; 
//    
//    public ClothingProduct(String name, double price, double discount) {
//        this.name = name;
//        this.price = price;
//        this.discount = discount;
//    }
//
//    @Override
//    public double calculatePrice() {
//        return price - (price * (discount / 100)); 
//    }
//
//    @Override
//    public String toString() {
//        return "ClothingProduct{" +
//               "name='" + name + '\'' +
//               ", price=" + price +
//               ", discount=" + discount +
//               '}';
//    }
//}
//
//class ShoppingCartImpl implements ShoppingCart {
//    private List<Product> products;
//
//    public ShoppingCartImpl() {
//        setProducts(new ArrayList<>());
//    }
//
//    @Override
//    public void addToCart(Product product) {
//        getProducts().add(product);
//    }
//
//    @Override
//    public double calculateTotalPrice() {
//        double totalPrice = 0;
//        for (Product product : getProducts()) {
//            totalPrice += product.calculatePrice();
//        }
//        return totalPrice;
//    }
//
//	public List<Product> getProducts() {
//		return products;
//	}
//
//	public void setProducts(List<Product> products) {
//		this.products = products;
//	}
//}
//
//public class ShoppingInterface {
//    public static void main(String[] args) {
//        // Create products
//        ElectronicProduct laptop = new ElectronicProduct("Laptop", 1200.00);
//        ClothingProduct shirt = new ClothingProduct("Shirt", 50.00, 10.0); // 10% discount
//
//        // Create a shopping cart
//        ShoppingCart cart = new ShoppingCartImpl();
//
//        // Add products to the cart
//        cart.addToCart(laptop);
//        cart.addToCart(shirt);
//
//        // Calculate the total price
//        double totalPrice = cart.calculateTotalPrice();
//        System.out.println("Total price: " + totalPrice); // Output: Total price: 1245.0
//
//        // Print the cart contents
//        System.out.println("Cart Contents:");
//        for (Product product : ((ShoppingCartImpl) cart).getProducts()) {
//            System.out.println(product);
//        }
//    }
//}
//
