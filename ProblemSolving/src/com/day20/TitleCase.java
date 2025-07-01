package com.day20;

public class TitleCase {
	public static void main(String[] args) {
		String s="how are you?";
		String[] words=s.split(" ");
		String resultWords="";
		for(String word:words) {
			if(!word.isEmpty()) {
				String first=word.substring(0,1).toUpperCase();
				String remaining=word.substring(1);
				resultWords=resultWords+first+remaining+" ";
			}
		}
		System.out.println(resultWords);
	}
}
