package com.day36;

import java.util.Arrays;

public class FindDuplicateAndMissingNumber {
	public static int[] findErrorNums(int[] a) {
		int duplicate=-1;
		int missing=-1;
		for(int i=0;i<a.length-1;i++) {
			int value=Math.abs(a[i]);
			if(a[value-1]<0) {
				duplicate=value;
			}else {
				a[value-1]=-a[value-1];
			}
		}
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>0) {
				missing=i+1;
				break;
			}
		}
		return new int[] {duplicate,missing};
	}
	public static void main(String[] args) {
		int[] a= {1,2,2,4};
		System.out.println(Arrays.toString(findErrorNums(a)));
	}
}
