package com.day3;

public class Perfectnumber {
	public static void main(String[] args) {
		int num=28;
		int sum=0;
		for(int i=1;i<=num-1;i++) {
			if (num%i==0)
				sum+=i;
		}
		if(sum==num) {
			System.out.println("it is a perfect number");
		} else {
			System.out.println("it is not a perfect number");
		}
	}
}
