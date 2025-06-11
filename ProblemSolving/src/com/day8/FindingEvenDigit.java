package com.day8;

public class FindingEvenDigit {
	public void isEven(int num) {
		int mod = 0;
		boolean isFound=false;
		while(num!=0) {
			mod=num%10;
			if(mod%2==0) {
				isFound=true;
				System.out.println("Even Digits are:"+mod+" , Valid");
			}
			num=num/10;	
		}
		if(!isFound) {
			System.out.println("No even digits in number");
		}
		
	}
	public static void main(String[] args) {
		FindingEvenDigit even=new FindingEvenDigit();
		even.isEven(796412);
	}
}
