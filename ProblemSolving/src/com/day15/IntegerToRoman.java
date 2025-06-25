package com.day15;

public class IntegerToRoman {
	public static String toRoman(int num) {
		int[] value= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] symbols= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		String roman="";
		for(int i=0;i<value.length;i++) {
			while(num>=value[i]) {
				num-=value[i];
				roman+=symbols[i];
			}
		}
		return roman;
	}
	public static void main(String[] args) {
		String rom=toRoman(234);
		System.out.println(rom);
	}
}
