package com.day33;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	public static int[] product(int[] a) {
		int[] prefixProduct=new int[a.length];
		prefixProduct[0]=1;
		for(int i=1;i<a.length;i++) {
			prefixProduct[i]=prefixProduct[i-1]*a[i-1];
		}
		int suffixProduct=1;
		for(int i=a.length-1;i>=0;i--) {
			prefixProduct[i]=prefixProduct[i]*suffixProduct;
			suffixProduct=suffixProduct*a[i];
		}
		return prefixProduct;
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		System.out.println(Arrays.toString(product(a)));
	}
}
