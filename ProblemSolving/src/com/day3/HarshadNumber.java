package com.day3;

public class HarshadNumber {
	public static void main(String[] args) {
		int num=18;
		int temp=num;
		int sum=0;
		int rem=0;
		while(num>0) {
			rem=num%10;
			sum+=rem;
			num/=10;
		}
		if(temp%sum==0) {
			System.out.println("It is a Harshad Number");
		} else {
			System.out.println("It is not a Harshad Number");
		}
	}
}
