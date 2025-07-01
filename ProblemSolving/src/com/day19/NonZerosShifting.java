package com.day19;

public class NonZerosShifting {
	public static void main(String[] args) {
		int [] a= {0, 2, 0, 5, 0, 3, 7};
		int count=0;
		int temp=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				temp=a[i];
				a[i]=a[count];
				a[count]=temp;
				count++;
			}
		}
		for(int element:a) {
			System.out.print(element+" ");
		}
	}
}
