package com.day18;

public class HCF {
	public static int findHCF(int a, int b) {
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	public static void main(String[] args) {
		int a=36;
		int b=60;
		int hcf=findHCF(a, b);
		System.out.println(hcf);
	}
}
