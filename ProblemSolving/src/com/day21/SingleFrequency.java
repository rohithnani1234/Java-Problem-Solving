package com.day21;

public class SingleFrequency {
	public static void frequency() {
		String a="a[3]b[2]c[1]";
		String alpha="";
		String number="";
		String specialChar="";
		String newString="";
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch>='a' && ch<='z') {
				alpha+=ch;
			}
			else if(ch>='0' && ch<='9') {
				number+=ch;
				int num=Integer.parseInt(number);
				newString=newString+alpha.repeat(num);
				alpha="";
				number="";
			} else {
				specialChar+=ch;
			}
		}
		System.out.println(newString);
	}
	public static void main(String[] args) {
		frequency();
	}
}
