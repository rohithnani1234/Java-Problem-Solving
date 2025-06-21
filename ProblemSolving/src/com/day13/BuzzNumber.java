package com.day13;


public class BuzzNumber {
	public static void buzzMethod(int num) {
		int mod=num%10;
		if(mod==7 || num%7==0) {
			System.out.println("it is a buzz number");
		} else {
			System.out.println("it is not a buzz number");
		}
	}
	public static void main(String[] args) {
		buzzMethod(77);
	}
}
