package com.day4;

public class PerfectSquare {
	public boolean isPerfectSqaure(int num) {
		if(num<=0) {
			System.out.println("Invalid Number, Enter a Valid Number");
			return  false;
		}
		for (int i=1;i<=10000;i++) {
			if (num==i*i) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		PerfectSquare perfectSquare=new PerfectSquare();
		boolean perfect=perfectSquare.isPerfectSqaure(0);
		if(perfect==true) {
			System.out.println("It is a Perfect Square");
		} else {
			System.out.println("It is not a Perfect Square");
		}
	}
}
