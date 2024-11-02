package Generics;

import java.util.*;


class ListClass<T>{
	
	Object arr[];
	int cnt=0;
	int currentCapacity=0;
	public ListClass(int capacity) {
		// TODO Auto-generated constructor stub
		arr=new Object[capacity];
		currentCapacity=capacity;
	}

	public void addElement(T t) {
		if(currentCapacity > cnt) {
			arr[cnt++]=t;
		}else {
			int i=0;
			//create a new array with new capacity and copy the old array into new array
			currentCapacity = currentCapacity*2;
			Object[] tempArr = new Object[currentCapacity];
			
			for(i=0;i<arr.length;i++) {
				tempArr[i]=arr[i];
			}
			tempArr[i]=t;
			arr=tempArr;
		}
	}
	public void getElements() {
		for(Object obj:arr) {
			System.out.println("Object is : "+obj);
		}
	}
	
	
}
public class GenericList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListClass<Integer> genericlist=new ListClass<Integer>(2);
		
//	    List<Integer> integerList= Arrays.asList(new Integer[] {1,2,3,4,5});
		genericlist.addElement(100);
		genericlist.addElement(200);
		genericlist.addElement(100);
		genericlist.addElement(200);	
		genericlist.addElement(100);
		genericlist.addElement(200);
		
		
		genericlist.getElements();
		
	
		
	}

}
