package com.day20;

public class SubStringPattern {
	public static void main(String[] args) {
		String s="abcde";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				System.out.println(s.substring(i,j));
			}
			System.out.println();
		}
	}
}
