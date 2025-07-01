package com.day16;

public class LargestElement {
	public static void main(String[] args) {
		int[] a= {3,1,4,1,5,9};
		int largest=0;
		for (int i = 0; i <a.length-1; i++) {
			if(a[i+1]>a[i]) {
				largest=a[i+1];
			}
		}
		System.out.println("Largest element in an array is:"+largest);
	}
}
