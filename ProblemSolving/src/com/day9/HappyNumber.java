package com.day9;

public class HappyNumber {
	public static void isSum1(int num) {
		int sum=0;
		while(num>0) {
			int digit=num%10;
			int square=digit*digit;
			sum=sum+square;
			num=num/10;
		}
		if(sum==1) {
			System.out.println("It is a Sunny Number");
		} else if(sum>1 && sum<=9) {
			System.out.println("It is not a sunny number");
		} else {
			isSum1(sum);
		}
	}
	public static void main(String[] args) {
		int number=16;
		isSum1(number);
	}
}
