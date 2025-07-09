package com.day25;

public class UnionOfArrays {
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {4,5,6};
		int size=a.length+b.length;
		int[] c=new int[size];
		int count=0;
		for(int i=0;i<a.length;i++) {
			c[count]=a[i];
			count++;
		}
		for(int i=0;i<b.length;i++) {
			int j;
			for(j=0;j<count;j++) {
				if(c[j]==b[i]) {
					break;
				}
			}
			if (j==count) {
				c[count]=b[i];
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			System.out.print(c[i]+" ");
		}
	}
}
