package com.day11;

public class DecimalToOctal {
	public static int octalToDecimal(String octalStr) {
		int octal=0;
		int count=0;
		for(int i=octalStr.length()-1;i>=0;i--) {
			char digit=octalStr.charAt(i);
			if(digit<'0' || digit>'7') {
				System.out.println("Invalid Number");
			}
			octal+=((digit-'0')*Math.pow(8, count));
			count++;
		}
		return octal;
	}
	public static void main(String[] args) {
		String str="123654";
		int octal=octalToDecimal(str);
		System.out.println("The octal number is:"+octal);
	}
}
