package com.day11;

public class BinaryToDecimal {
	public static int binaryToDecimal(String binaryStr) {
		int decimal=0;
		int count=0;
		for(int i=binaryStr.length()-1;i>=0;i--) {
			char bit=binaryStr.charAt(i);
			if(bit=='1') {
				decimal+=Math.pow(2, count);
			}
			count++;
		}
		return decimal;
	}
	public static void main(String[] args) {
		String binary="1011010";
		int decimal=binaryToDecimal(binary);
		System.out.println("The decimal number is:"+decimal);
		
	}
}
