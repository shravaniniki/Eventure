//package Java8.Stream_problems;
//
//import java.util.ArrayList;
//import java.util.List;
//
//interface SquareOperation {
//    int square(int number);
//}
//
//class MappingOperation {
//    public static List<Integer> squareList(List<Integer> numbers, SquareOperation operation) {
//        // Implement mapping logic using Stream API and lambda expressions
//    	 List<Integer> filteredList = new ArrayList<>();
//         for (int number : numbers) {
//        	     int n=operation.square(number);
//                 filteredList.add(n);
//             
//         }
//         return filteredList;
//    }
//}
//
//public class Mapping_OperationWithStreams {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Integer> num=List.of(1,2,3,5,7,8);
//		
////		SquareOperation square=(n)->n*n;
//		
//		//filter and map combined
//		//SquareOperation square= num.stream().filter(n-> n%2==0).map(n-> n*n);
//		
//	}
//
//}
