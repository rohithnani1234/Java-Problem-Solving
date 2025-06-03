package com.day1;

public class SunnyNumber {
	public static void main(String[] args) {
		int num=8;
		boolean isSunny=false;
		for (int i=1;i<=num+1;i++) {
			//int j=num+1;
			if(i*i==num+1) {
				isSunny=true;
			}
		}
		if(isSunny) {
			System.out.println("It is a sunny number");
		} else {
			System.out.println("It is not a sunny number");
		}
	}
}
