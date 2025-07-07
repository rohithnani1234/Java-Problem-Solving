package com.day23;

public class Panagram {
	public static void allLetters(String a) {
		a=a.toLowerCase();
		boolean allLetterPresent=true;
		for(char ch='a';ch<='z';ch++) {
			if(!a.contains(String.valueOf(ch))) {
				allLetterPresent= false;
				break;
			}
		}
		if(allLetterPresent) {
			System.out.println("It is a Panagram");
		} else {
			System.out.println("It is a not Panagram");
		}
	}
	public static void main(String[] args) {
		allLetters("abcdefghijklmnopqrstuvwxyz");
	}
}
