package com.day22;

public class RotatedSortedArray {
	public static boolean is_Rotated(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static boolean rotated_array(int[] a) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			if(is_Rotated(a)) {
				return true;
			}
			int first=a[0];
			for(int j=0;j<n-1;j++) {
				a[j]=a[j+1];
			}
			a[n-1]=first;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a= {3,4,5,1,2};
		System.out.println(rotated_array(a));
	}
}
