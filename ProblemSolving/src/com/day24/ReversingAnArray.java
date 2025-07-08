package com.day24;

import java.util.Arrays;

public class ReversingAnArray {
	public static void reverse(int[] arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7};
		reverse(a);
	}
}
