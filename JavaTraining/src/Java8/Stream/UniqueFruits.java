package Java8.Stream;

import java.util.List;
import java.util.Optional;

public class UniqueFruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruitList=List.of("apple","banana","mango","apple","Watermelon","apple");
		
		long uniqueFruitCount=fruitList.stream().distinct().count();
		System.out.println("Unique fruits count is : "+uniqueFruitCount);
		
		//how many apples in the list
		long appleCount = fruitList.stream().filter(fruit->fruit.equals("apple")).count();
		System.out.println("Apple count in list is "+appleCount);
		
		//find fruit which has highest length
		
		Optional<Integer> max=fruitList.stream().map((fruit)->fruit.length()).max((f,s)->{
			if(f==s) {
				return 0;
			}
			if(f>s) {
				return 1;
			}
			return -1;
		});
		System.out.println("fruit with max no of leeters is: "+max.get());
		
	}

}
