package com.day10;


public class DecimalToBinary {
	public void remainder(int num) {
		String count="";
		while(num!=0) {
			int rem=num%2;
			count=rem+count;
			num=num/2;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		DecimalToBinary binary=new DecimalToBinary();
		binary.remainder(5);
	}
}
