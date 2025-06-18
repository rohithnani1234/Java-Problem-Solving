package com.day10;

public class DecimalToOctal {
	public void remainder(int num) {
		String count="";
		while(num!=0) {
			int rem=num%8;
			count=rem+count;
			num=num/8;
		}
		System.out.println("The octal of a number is:"+count);
	}
	public static void main(String[] args) {
		DecimalToOctal octal=new DecimalToOctal();
		octal.remainder(45);
	}
}
