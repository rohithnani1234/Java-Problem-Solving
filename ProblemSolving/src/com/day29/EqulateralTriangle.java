package com.day29;

public class EqulateralTriangle {
	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
