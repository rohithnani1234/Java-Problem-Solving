package com.day35;

import java.util.Arrays;

public class ContainsDuplicatesOrNot {
	public static boolean duplicates(int[] a) {
		int count=0;
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
			if(a[i+1]==a[i]) {
				count++;
			}
		}
		return count>=1?true:false;
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,1};
		System.out.println(duplicates(a));
	}
}
