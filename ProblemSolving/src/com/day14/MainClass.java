package com.day14;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int [] a=new int[size];
		for(int i=4;i<=a.length;i--) {
			if(i>=0) {
				a[i]=sc.nextInt();
			} else {
				break;
			}
		}
		for(int i=4;i<=a.length;i--) {
			if(i>=0) {
				System.out.println("The value of index:"+i+" is:"+a[i]);
			}
			else {
				break;
			}
			
		}
		for(int i=a.length-1;i>=0;i--) {
			System.out.println("The value of index:"+i+" is:"+a[i]);
		}
		sc.close();
	}
}
