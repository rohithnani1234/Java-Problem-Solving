package com.day27;

import java.util.ArrayList;

public class SymmetricDifferenceArraysSets {
	public static ArrayList<Integer> symmetric(int[] a,int[] b){
		ArrayList<Integer> res=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			boolean found=false;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					found=true;
					break;
				}
			}
			if(!res.contains(a[i]) && !found) {
				res.add(a[i]);
			}
		}
		for(int i=0;i<b.length;i++) {
			boolean found=false;
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					found=true;
					break;
				}
			}
			if(!res.contains(b[i]) && !found) {
				res.add(b[i]);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {3,4,5,6};
		System.out.println(symmetric(a, b));
	}
}
