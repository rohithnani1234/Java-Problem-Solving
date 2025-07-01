package com.day20;

public class ReverseWord {
	public static void main(String[] args) {
		String s="how are you?";
		String revString="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			revString=revString+ch;
		}
		System.out.println(revString);
	}
}
