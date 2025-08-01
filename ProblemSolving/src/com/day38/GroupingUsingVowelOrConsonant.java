package com.day38;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GroupingUsingVowelOrConsonant {
	public static void main(String[] args) {
		String s="Aryan Kiara Zayden Anika Riaan Meera Vivaan Tara Ayaan Niyati";
		String[] a=s.split(" ");
		Map<String, List<String>> m=new TreeMap<String, List<String>>();
		m.put("Vowels",new ArrayList<String>());
		m.put("Consonants",new ArrayList<String>());
		for(String str:a) {
			if(str.charAt(0)=='A' || str.charAt(0)=='E' || str.charAt(0)=='I' || str.charAt(0)=='O' || str.charAt(0)=='U') {
				m.get("Vowels").add(str);
			} else {
				m.get("Consonants").add(str);
			}
		}
		System.out.println(m);
	}
}
