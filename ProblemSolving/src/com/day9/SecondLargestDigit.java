package com.day9;

public class SecondLargestDigit {
	public void secondLargest(int num) {
		int max=-1;
		int secondMax=-1;
		int digit=0;
		while(num>0) {
			digit=num%10;
			if(digit>max) {
				secondMax=max;
				max=digit;
			} else if(digit<max && digit>secondMax){
				secondMax=digit;
			}
			num=num/10;
			
		}
		if(secondMax==-1) {
			System.out.println(max);
		} else {
			System.out.println(secondMax);
		}
	}
	public static void main(String[] args) {
		SecondLargestDigit second=new SecondLargestDigit();
		second.secondLargest(1);
	}
}