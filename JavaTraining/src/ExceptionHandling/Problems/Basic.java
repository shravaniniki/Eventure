package ExceptionHandling.Problems;

import java.util.Scanner;

//Basic problem and Multiple handling Exception
public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr= {2,4,5,4};
		try {
			int a=8;
			int num=Integer.parseInt(sc.next());
			System.out.println(num);
			int result=10/a;
			System.out.println(arr[4]);
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("Zero is not allowed");
		}catch(NumberFormatException e) {
			System.out.println("Input is not correct");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of index access");
		}
	}

}
