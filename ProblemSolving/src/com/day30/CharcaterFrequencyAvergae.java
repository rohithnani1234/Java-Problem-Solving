package com.day30;

public class CharcaterFrequencyAvergae {
	public static void main(String[] args) {
		String str="1243abc*&%ABCD";
		int n=str.length();
		String alpha="";
		double alphaFrequency=0;
		String capital="";
		double capitalFrequecy=0;
		String num="";
		double numberFrequency=0;
		String special="";
		double specialfrequency=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				alpha+=ch;
			} else if(ch>='A' && ch<='Z') {
				capital+=ch;
			} else if(ch>='0' && ch<='9') {
				num+=ch;
			} else {
				special+=ch;
			}
		}
		alphaFrequency=((double)alpha.length()/n)*100;
		System.out.println("Small Alphabets Frequency:"+alphaFrequency);
		numberFrequency=((double)num.length()/n)*100;
		System.out.println("Number Frequency:"+numberFrequency);
		capitalFrequecy=((double)capital.length()/n)*100;
		System.out.println("Capital Letter Frequency:"+capitalFrequecy);
		specialfrequency=((double)special.length()/n)*100;
		System.out.println("Special Character Frequency:"+specialfrequency);
	}
}
