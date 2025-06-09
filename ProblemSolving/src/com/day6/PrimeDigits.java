package com.day6;

public class PrimeDigits {
	public void primeDigits(int num) {
		boolean isPrimeDigit=false;
		int rem=0;
		while(num!=0) {
			rem=num%10;
			isPrimeDigit=true;
			for(int i=2;i<=rem/2;i++) {
				if(rem%i==0) {
					isPrimeDigit=false;
					break;
				}		
			}
			num=num/10;
			if(isPrimeDigit==true) {
				System.out.println(rem);
			}
		}
		
	}
	public static void main(String[] args) {
		PrimeDigits prime=new PrimeDigits();
		prime.primeDigits(56782345);
	}
}
