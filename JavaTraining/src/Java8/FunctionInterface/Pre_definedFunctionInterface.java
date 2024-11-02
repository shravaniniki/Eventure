package Java8.FunctionInterface;

import java.util.function.BiFunction;

//program to demonstrate implementation of pre=defined funcional interface :: Function

import java.util.function.Function;

public class Pre_definedFunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String,Integer> fun=(name)->name.length();//Function<T,R>
		//here it takes one argument and return one result in apply method of function
		String name="vajf";
		int len=fun.apply(name);
		System.out.println(name+" has "+len+" letters");
		
		//perform addition of 2numbers using a functional interface : BiFunction
		
		BiFunction<Integer,Integer,Integer> fun2=(x,y)->x+y;//BiFunction<T,U,R>
		//here it takes two argument and return one result in apply method of function

		int a=100;
		int b=400;
		
		System.out.println("sum of two numbers : "+fun2.apply(a, b));
	}

}
