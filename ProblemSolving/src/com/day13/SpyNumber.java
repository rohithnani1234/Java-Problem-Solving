package com.day13;

public class SpyNumber {
	public static void spyMethod(int num) {
		int temp=num;
		int sum=0;
		int mod=0;
		int product=1;
		int mod2=0;
		while(num!=0) {
			mod=num%10;
			sum=sum+mod;
			num=num/10;
		}
		while(temp!=0) {
			mod2=temp%10;
			product=product*mod2;
			temp=temp/10;
		}
//		System.out.println(sum);
//		System.out.println(product);
		if(sum==product) {
			System.out.println("It is a Spy Number");
		} else {
			System.out.println("It is not a Spy Number");
		}
	}
	public static void main(String[] args) {
		spyMethod(1124);
	}
}
