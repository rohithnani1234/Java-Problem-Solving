package com.day7;

public class NonFibonacciSeries {
	public void nonFibonacci(int n) {
		int a=0;
		int b=1;
		int c=a+b;
		int count=0;
		while(count<n) {
			if(c-b>1) {
				for(int i=b+1;i<c;i++) {
					System.out.print(i+" ");
					count++;
					if(count==n) {
						break;
					}
				}
			}
			a=b;
			b=c;
			c=a+b;
		}
	}
	public static void main(String[] args) {
		NonFibonacciSeries non=new NonFibonacciSeries();
		non.nonFibonacci(10);
		
	}
}
