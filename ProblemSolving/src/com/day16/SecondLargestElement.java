package com.day16;

public class SecondLargestElement {
	public static void main(String[] args) {
		int [] a= {3,1,4,1,5,9};
		int largest=0;
		int secondLargest=0;
		for (int i = 0; i < a.length-1; i++) {
			if(a[i+1]>a[i]) {
				largest=a[i+1];
				secondLargest=a [i];
			}
		}
		System.out.println("Second Largest element in an array is:"+secondLargest);
	}
}

