package com.day38;

import java.util.ArrayList;
import java.util.TreeMap;

public class NameGroupingUsingLength {
	public static void main(String[] args) {
		String s="Aryan Kiara Zayden Anika Riaan Meera Vivaan Tara Ayaan Niyati";
		String[] a=s.split(" ");
		TreeMap<Integer, ArrayList<String>> t=new TreeMap<Integer, ArrayList<String>>();
		for(String str:a) {
			Integer len=str.length();
			t.putIfAbsent(len, new ArrayList<String>());
			t.get(len).add(str);
		}
		System.out.println(t);
	}
}
