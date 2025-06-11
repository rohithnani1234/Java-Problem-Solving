package com.day7;

public class PerfectSquareDigit {
	public void perfectSquare(int num) {
		int mod;
		while(num>0) {
			mod=num%10;
			if(mod==0 || mod==1 || mod==4 || mod==9) {
				System.out.print(mod+" ");
			}
			num=num/10;
		}
	}
	public static void main(String[] args) {
		PerfectSquareDigit perfect=new PerfectSquareDigit();
		perfect.perfectSquare(45670);
	}
}
