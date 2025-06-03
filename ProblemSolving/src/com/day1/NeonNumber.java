package com.day1;

public class NeonNumber {
	public static void main(String[] args) {
		int num=9;
		int temp=num;
		int square=num*num;
		int sum=0;
		while(square!=0) {
			int rem=square%10;
			sum=sum+rem;
			square=square/10;
		}
		if(sum==temp) {
			System.out.println("It is a Neon Number");
		} else {
			System.out.println("It is not a Neon number");
		}
	}
}