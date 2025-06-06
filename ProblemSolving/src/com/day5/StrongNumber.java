package com.day5;

public class StrongNumber {
	public void strongNumber(int num) {
		int temp=num;
		int sum=0;
		int product;
		int mod=0;
		while(num!=0) {
			product=1;
			mod=num%10;
			for (int i=1;i<=mod;i++) {
				product=product*i;
			}
			sum=sum+product;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("It is a Strong Number");
		} else {
			System.out.println("It is not a Strong Number");
		}
	}
	public static void main(String[] args) {
		StrongNumber strong=new StrongNumber();
		strong.strongNumber(145);
	}
}
