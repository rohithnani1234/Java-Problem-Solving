package com.day26;

import java.util.ArrayList;

public class Intersection {
	public static ArrayList<Integer> intersection(int[] a,int[] b) {
		ArrayList<Integer> res=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					if(!res.contains(a[i])) {
						res.add(a[i]);
					}
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int[] b= {5,6,7,3,8,2};
		ArrayList<Integer> res=intersection(a, b);
		System.out.println(res);
	}
}
