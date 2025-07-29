package com.day37;

import java.util.ArrayList;

public class FibonacciPattern {
	public static ArrayList<Integer> fibonacci(int n){
		int firstNumber=0;
		int secondNumber=1;
		ArrayList<Integer> a=new ArrayList<Integer>();
		if(n>=1) {
			a.add(firstNumber);
		}
		if(n>=2) {
			a.add(secondNumber);
		}
		for(int i=0;i<n;i++) {
			int result=firstNumber+secondNumber;
			a.add(result);
			firstNumber=secondNumber;
			secondNumber=result;
		}
		return a;
	}
	public static void main(String[] args) {
		ArrayList<Integer> a=fibonacci(25);
		int index=0;
		int n=4;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a.get(index++)+" ");
			}
			System.out.println();
		}
	}
}
