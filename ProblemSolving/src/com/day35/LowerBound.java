package com.day35;

public class LowerBound {
	public static int lowerBound(int[] a,int target) {
		int left=0;
		int right=a.length-1;
		int lowerBound=-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(a[mid]>=target) {
				lowerBound=mid;
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		return lowerBound;
	}
	public static void main(String[] args) {
		int[] a= {5,7,13,20};
		int target=2;
		System.out.println(lowerBound(a, target));
	}
}
