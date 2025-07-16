package com.day29;

public class Digit8ToDigit5AndReverse {
	public static void main(String[] args) {
		String num="12345678";
		String num1="";
		for(int i=0;i<num.length();i++) {
			char ch=num.charAt(i);
			if(i>=4 && i<8) {
				num1+=ch;
			}
		}
		int newNumber=Integer.parseInt(num1);
		System.out.println("Index starts from 5 , then number is: "+newNumber);
		System.out.println();
		int sum=0;
		while(newNumber!=0) {
			int rem=newNumber%10;
			sum=(sum*10)+rem;
			newNumber/=10;
		}
		System.out.println("The reverse of a number which starts from index 5: "+sum);
	}
}
