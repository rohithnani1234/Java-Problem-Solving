package com.day5;

public class ArmstrongNumber {
	public void armstrongNumber(int num) {
		int temp=num;
		int sum=0;
		while(num!=0) {
			int mod=num%10;
			int cube=mod*mod*mod;
			sum=sum+cube;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("It is a Armstrong Number");
		} else {
			System.out.println("It is not a Armstrong Number");
		}
	}
	public static void main(String[] args) {
		ArmstrongNumber armstrong=new ArmstrongNumber();
		armstrong.armstrongNumber(175);
	}
}
