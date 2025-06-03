package com.day2;

public class FibanocciSeries {
	public static void main(String[] args) {
		int firstNumber=0;
		int secondNumber=1;
		for(int i=0;i<=10;i++) {
			if (i==0) {
				System.out.println(firstNumber);
			} else if(i==1) {
				System.out.println(secondNumber);
			} else {
				int result=firstNumber+secondNumber;
				System.out.println(result);
				firstNumber=secondNumber;
				secondNumber=result;
			}
		}
	}
}
