package Abstraction.Problems;

abstract class Shape {
    String name;
    String color;

    Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

    abstract void displayShapeInfo();
}

class Circle extends Shape {
    double radius;

    Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public void displayShapeInfo() {
        System.out.println(name + " - Area: " + String.format("%.2f", calculateArea()) + " square units, Perimeter: " + String.format("%.2f", calculatePerimeter()) + " units");
    }
}

class Square extends Shape {
    double sideLength;

    Square(String name, String color, double sideLength) {
        super(name, color);
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    double calculatePerimeter() {
        return 4 * sideLength;
    }
    
    public void displayShapeInfo() {
        System.out.println(name + " - Area: " + String.format("%.2f", calculateArea()) + " square units, Perimeter: " + String.format("%.2f", calculatePerimeter()) + " units");
    }
}

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Circle circle = new Circle("Circle", "Red", 7);
	     Square square = new Square("Square", "Blue", 5);
	     
	     circle.displayShapeInfo();
	     square.displayShapeInfo();

	}

}
