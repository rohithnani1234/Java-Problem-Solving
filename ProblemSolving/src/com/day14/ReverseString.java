package com.day14;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String original=sc.nextLine();
		String reverse="";
		for(int i=original.length()-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		System.out.println("Reversed String is:"+reverse);
		sc.close();
	}
}
