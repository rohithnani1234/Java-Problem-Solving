package com.day37;

import java.util.Arrays;

public class ReturningMaximumAndMinimum {
	public static int[] findMaxMin(int[] a) {
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		return new int[] {max,min};
	}
	public static void main(String[] args) {
		int[] a= {23,56,43,78,65,90};
		System.out.println(Arrays.toString(findMaxMin(a)));
	}
}
