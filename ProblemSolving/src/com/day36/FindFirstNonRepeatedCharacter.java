package com.day36;

public class FindFirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String a="Hello";
		for(int i=0;i<a.length();i++) {
			boolean unique=true;
			for(int j=0;j<a.length();j++) {
				if(i!=j && a.charAt(i)==a.charAt(j)) {
					unique=false;
					break;
				}
			}
			if(unique) {
				System.out.println(a.charAt(i));
				break;
			}
		}
	}
}
