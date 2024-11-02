package Java8.Stream;
//program to demonstrate creation of a stream

import java.util.OptionalDouble;
import java.util.stream.*;
public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream numStream = IntStream.of(10,20,30,59);
		
		Integer sum=numStream.sum();
		
		System.out.println("Sum of numstream is : "+sum);
		numStream=IntStream.of(10,20,30,59);//we have to declare again bcz streams are not reusable it gives error if i try to do it
		OptionalDouble avg=numStream.average();
		System.out.println("Average is : "+avg);
		
		
		IntStream rangeStream = IntStream.range(1, 10);
		rangeStream.forEach((ele)->System.out.println("Elements is : "+ele));
		
	   IntStream.rangeClosed(1, 10).forEach((ele)->System.out.println("----Elements is : "+ele));
		
	   System.out.println();
	   
	   IntStream.rangeClosed(1,20).map(ele -> ele*2).filter(ele->ele%2==0).forEach(ele->System.out.println(ele));
	   
	   
	}

}
