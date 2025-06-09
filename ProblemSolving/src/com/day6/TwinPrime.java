package com.day6;

public class TwinPrime {
	public void twinPrime(int num) {
		boolean isPrime=false;
		int currentPrime=1;
		int lastPrime=1;
		for(int i=2;i<=num;i++) {
			isPrime=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime==true) {
				currentPrime=i;
			}
			if (currentPrime-lastPrime==2) {
				System.out.println("("+lastPrime+","+currentPrime+")");
			}
			lastPrime=currentPrime;
		}
	}	
	public static void main(String[] args) {
		TwinPrime prime=new TwinPrime();
		prime.twinPrime(100);
	}
}
