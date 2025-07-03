package com.day22;

public class LongestOddNumber {
	public static void oddNumber() {
		String num="2580916";
		for(int i=num.length()-1;i>=0;i--) {
			char ch=num.charAt(i);
			int number=ch-'0';
			if(number%2==1) {
				System.out.println(num.substring(0,i+1));
				break;
			}
		}
	}
	public static void main(String[] args) {
		oddNumber();
	}
}
