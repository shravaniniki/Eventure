//package Java8.FunctionInterface;
//
//import java.util.function.Consumer;
//
////program to demonstrate 
//
//
////consumer does not return anything
//public class Pre_definedFunctionInterface2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Consumer<String> cityConsumer = (city)->{
//			char arr[]=city.toCharArray();
//			int cnt=0;
//			for(int i=0;i<arr.length;i++){
//				if(arr[i]=='a'||arr[i]=='e') {
//					cnt++;
//				}
//			}
//			System.out.println(city+" has"+ cnt +" vowels");
//		};
//		
//		cityConsumer.accept("bangalore");
//		
//
//		//concat firstname and lastname of a person and print them using BiConsumer
//		BiConsumer<String,String> concat=(fstname,lastname)->{
//			System.out.println("Concatination in BiFunction "+(fstname+lastname));
//		};
//		
//		String fstname="dfg";
//		String lastname="fvvg";
//		
//		concat.accept(fstname,lastname);
//		
//		
//	}
//
//}
