package com.day8;

public class LargestDigitInNumber {
	public void largestnumber(int num){
		int maxDigit=0;
		while (num!=0) {
			int mod=num%10;
			if(mod>maxDigit) {
				maxDigit=mod;
			}
			num=num/10;
		}
		System.out.println("Max Digit is:"+maxDigit);
	}
	public static void main(String[] args) {
		LargestDigitInNumber largest=new LargestDigitInNumber();
		largest.largestnumber(9856714);
	}
}
