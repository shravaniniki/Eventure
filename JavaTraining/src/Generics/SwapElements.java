package Generics;

public class SwapElements {

	 public static <T> void swapElements(T[] array, int index1, int index2) {
	        // Swap the elements at index1 and index2
		 T a=array[index1];
		 array[index1]=array[index2];
		 array[index2]=a;
	    }

	    public static <T> void displayArray(T[] array) {
	        // Display the elements of the array
	    	for(int i=0;i<array.length;i++) {
	    		System.out.println(array[i]);
	    	}
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	  String[] stringArray = {"apple", "orange", "banana"};
	  swapElements(stringArray, 0, 2);
      displayArray(stringArray);
		    
	}

}
