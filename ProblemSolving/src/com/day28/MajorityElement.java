package com.day28;

public class MajorityElement {
	public static int majority(int[] a) {
		int count=0;
		int majority=-1;
		for(int i=0;i<a.length;i++) {
			if(count==0) {
				majority=a[i];
				count=1;
			} else {
				if(majority==a[i]) {
					count++;
				} else {
					count--;
				}
			}
		}
		count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==majority) {
				count++;
			}
		}
		if(count>(a.length)/2) {
			return majority;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a= {2,2,1,1,2,2};
		System.out.println(majority(a));
	}
}
