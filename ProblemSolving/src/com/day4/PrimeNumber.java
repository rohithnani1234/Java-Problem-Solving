package com.day4;

public class PrimeNumber {
	public boolean isPrime(int num) {
		if(num<0) {
			return false;
		} else if(num==1) {
			return false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		PrimeNumber primeNumber=new PrimeNumber();
		boolean prime=primeNumber.isPrime(1);
		if(prime == true) {
			System.out.println("it is a prime number");
		} else {
			System.out.println("it is not a prime number");
		}
	}
}
