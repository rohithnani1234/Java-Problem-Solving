package com.day18;

public class ReverseAnArray {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		int size=a.length;
		int temp=0;
		int left=0;
		int right=a.length-1;
		while(left<right) {
			temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;
		}
		for(int ele:a) {
			System.out.print(ele+ " ");
		}
	}
}
