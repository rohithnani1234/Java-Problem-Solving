package com.day12;

public class HexaDecimalToDecimal {
	public static int octalNumber(String hexaStr) {
		int decimal=0;
		int count=0;
		for(int i=hexaStr.length()-1;i>=0;i--) {
			char ch=hexaStr.charAt(i);
			int digitValue = 0;
			if(ch>='0' && ch<='9') {
				digitValue=(ch-'0');
			} else if(ch>='A' && ch<='F') {
				digitValue=ch-'A'+10;
			} else if(ch>='a' && ch<='f') {
				digitValue=ch-'a'+10;
			} else {
				System.out.println("Invalid Number");
			}
			decimal+=digitValue*Math.pow(16, count);
			count++;
		}
		return decimal;
	}
	public static void main(String[] args) {
		String hexa="1A2";
		int decimal=octalNumber(hexa);
		System.out.println("The Decimal Number is:"+decimal);
	}
}
