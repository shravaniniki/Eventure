package com.ford.JavaHandsOn;

public class PrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,10,20};
		int[] prefix=new int[arr.length];
		prefix[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			prefix[i]=prefix[i-1]+arr[i];
		}
		
		for(int n:prefix) {
			System.out.print(n+" ");
		}
	}
	

}
