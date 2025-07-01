package com.day16;

public class MissingNumber {
	public static void main(String[] args) {
		int[] a= {1,2,4,5};
		int n=a.length+1;
		int nSum=(n*(n+1))/2;
		int actual=0;
		for (int i = 0; i < a.length; i++) {
			actual+=a[i];
		}
		int missingNumber=nSum-actual;
		System.out.println("Missing Number in an array is:"+missingNumber);
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=i+1) {
				System.out.println("Missing Number in an array is:"+(i+1));
				break;
			}
		}
	}
}
