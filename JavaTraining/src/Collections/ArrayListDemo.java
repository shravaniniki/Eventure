package Collections;

import java.util.ArrayList;
import java.util.*;
public class ArrayListDemo {
     public static List<Integer> vowelCount(ArrayList<String> cityList){
    	List<Integer> count=new ArrayList<Integer>();
    	 for(int i=0;i<cityList.size();i++) {
    		 count.add(i,vowel(cityList.get(i)));
    	 }
    	 
    	 return count;
     }
	public static int vowel(String string) {
		// TODO Auto-generated method stub
		int count =0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='a' || string.charAt(i)=='e'|| string.charAt(i)=='i'
||	string.charAt(i)=='o' || string.charAt(i)=='u'|| string.charAt(i)=='A' ||
	string.charAt(i)=='E' || string.charAt(i)=='I'|| string.charAt(i)=='O'|| string.charAt(i)=='U'){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Hyderabad");
		cityList.add("Mumbai");
		cityList.add("Madurai");
		List<Integer> finalList=vowelCount(cityList);
		System.out.println("Vowels in the cities:" + finalList);
	}

}
