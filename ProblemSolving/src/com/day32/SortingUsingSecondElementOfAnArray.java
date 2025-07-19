package com.day32;

import java.util.Arrays;

public class SortingUsingSecondElementOfAnArray {
	public static void main(String[] args) {
		int[] a={23,54,32,9,10,13,78,65};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-2;j++) {
				if((a[j]/10)>(a[j+1]/10)) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
