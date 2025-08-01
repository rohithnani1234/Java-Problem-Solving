package com.day38;

import java.util.ArrayList;
import java.util.TreeMap;

public class NameGrouping {
	public static void main(String[] args) {
		String s="Aryan Kiara Zayden Anika Riaan Meera Vivaan Tara Ayaan Niyati";
		String[] a=s.split(" ");
		TreeMap<Character, ArrayList<String>> t=new TreeMap<Character, ArrayList<String>>();
		for(String str:a) {
			char ch=str.charAt(0);
			t.putIfAbsent(ch, new ArrayList<String>());
			t.get(ch).add(str);
		}
		System.out.println(t);
	}
}
