package Generics;
import java.util.*;

//class NumberOnlyClass{
//	//lowerbound type(it will accept only the child classes or those type of object)
//	public <T extends Number> void displayElements(List<T> t) {
//		for(T ele:t) {
//			System.out.println("Element is: "+ele);
//		}
//	}
//	System.out.println("--------------");
//}
//-----------------------------------------------------
class NumberOnlyClass{
	// ?--wildcard (only applicable in methods)
	
//generic method with upperbound type and accepts NUmber or its subtypes for(?)
	public <T> void displayNumberorChildElements(List<?  extends Number> t) {
		for(Object ele:t) {
			System.out.println("Element is: "+ele);
		}
	}
	
	//generic method with lowerbound type and accepts String or its supertypes for(?)
	public <T> void displayStringorParentElements(List<?  super String> t) {
		for(Object ele:t) {
			System.out.println("Element is: "+ele);
		}
	}
	
	//generic method with unbounded type and accepts any type for(?)
	
	public <T> void displayAnyElementTypes(List<?> t) {
		for(Object ele:t) {
			System.out.println("Element is: "+ele);
		}
	}
	
}

public class WildCardGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberOnlyClass obj=new NumberOnlyClass();
		System.out.println("----UpperBound wildcard----");
		Integer[] intArr= {1,2,3,4,5};
		List<Integer> intList=Arrays.asList(intArr);
		obj.displayNumberorChildElements(intList);
		
		System.out.println("----LowerBound wildcard-----");
		String[] strArr= {"hello","hi","Bye"};
		List<String> strList=Arrays.asList(strArr);
		obj.displayStringorParentElements(strList);
		
		System.out.println("----UnBounded wildcard-----");
		Double[] doubleArr= {1.1,2.2,3.3,4.4,5.5};
		List<Double> doubleList=Arrays.asList(doubleArr);
		obj.displayAnyElementTypes(doubleList);
		
//		System.out.println("----UnBounded wildcard-----");
//		Product p1=new Product(100,"fan",3400.33);
//		Product p2=new Product(200,"chair",4500.34);
//		List<Product> prodList=Arrays.asList(new Product[] {p1,p2});
//		obj.displayAnyElementTypes(prodList);
	}

}
