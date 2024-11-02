//package ExceptionHandling;
//import java.util.*;
//
//
//class Product {
//    private String name;
//    private double price;
//
//    public Product(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//}
//
//class Order {
//    private Customer customer;
//    private List<Product> items;
//    private Address deliveryAddress;
//
//    public Order(Customer customer, List<Product> items, Address deliveryAddress) {
//        this.customer = customer;
//        this.items = items;
//        this.deliveryAddress = deliveryAddress;
//    }
//
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public List<Product> getItems() {
//        return items;
//    }
//
//    public Address getDeliveryAddress() {
//        return deliveryAddress;
//    }
//
//    // Method to place an order
//    public void placeOrder() throws DeliveryException {
//        System.out.println("Order placed for customer: " + customer.getName());
//        System.out.println("Delivery address: " + deliveryAddress.getAddress());
//        System.out.println("Items:");
//        for (Product item : items) {
//            System.out.println("- " + item.getName() + " (Price: " + item.getPrice() + ")");
//        }
//
//        // Simulate delivery attempt
//        try {
//            CourierService.deliverOrder(this);
//            System.out.println("Order delivered successfully!");
//        } catch (DeliveryException e) {
//            System.out.println("Delivery failed: " + e.getMessage());
//            // Handle the exception - Inform the customer
//            customer.informDeliveryFailure(e);
//        }
//    }
//}
//
//class Address {
//    private String address;
//
//    public Address(String address) {
//        this.address = address;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//}
//
//class Customer {
//    private String name;
//
//    public Customer(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    // Method to inform the customer about delivery failure
//    public void informDeliveryFailure(DeliveryException e) {
//        System.out.println("Dear " + name + ", your order delivery failed due to: " + e.getMessage());
//        System.out.println("Please provide an alternative address or contact customer service.");
//    }
//}
//
//class DeliveryException extends Exception {
//    public DeliveryException(String message) {
//        super(message);
//    }
//}
//
//class CourierService {
//    // Method to simulate delivery attempt
//    public static void deliverOrder(Order order) throws DeliveryException {
//        // Simulate checking if the address is valid
//        Address deliveryAddress = order.getDeliveryAddress();
//        if (deliveryAddress.getAddress().equals("Invalid Address")) {
//            throw new DeliveryException("Delivery address is not valid.");
//        } else {
//            System.out.println("Delivery initiated...");
//            // ... (simulate delivery process) ...
//        }
//    }
//}
//
//
//public class ExampleProblem {
//	public static void main(String[] args) {
//		Product product1 = new Product("Laptop", 1000.00);
//
//        // Create a customer
//        Customer customer1 = new Customer("John Doe");
//
//        // Create a delivery address
//        Address deliveryAddress = new Address("Invalid Address"); // Simulate invalid address
//
//        // Create an order
//        List<Product> items = new ArrayList<>();
//        items.add(product1);
//        Order order1 = new Order(customer1, items, deliveryAddress);
//
//        // Place the order
//        try {
//            order1.placeOrder();
//        } catch (DeliveryException e) {
//            System.out.println("Exception caught in Flipkart: " + e.getMessage());
//        }
//	}
//}
