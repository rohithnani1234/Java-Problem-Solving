package com.day2;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num=12346;
		int temp=num;
		int rev=0;
		while(num>0) {
			rev=rev*10+(num%10);
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("it is a palindrome number");
		} else {
			System.out.println("It is not a palindrome number");
		}
	}
}
