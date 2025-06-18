package com.day10;

public class DecimalToHexaDecimal {
	public void remainder(int num) {
		String count="";
		char[] hexaChars= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(num!=0) {
			int rem=num%16;
			count=hexaChars[rem]+count;
			num=num/16;
		}
		System.out.println("The HexaDecimal of a number is:"+count);
	}
	public static void main(String[] args) {
		DecimalToHexaDecimal hexa=new DecimalToHexaDecimal();
		hexa.remainder(678);
	}
}
