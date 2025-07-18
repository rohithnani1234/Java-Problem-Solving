package com.day31;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double r1=0;
		double r2=0;
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=(b*b)-(4*a*c);
		if(d==0) {
			r1=-b/(2*a);
			r2=-b/(2*a);
			System.out.println("Roots are real and equal");
			System.out.println("First Root is:"+r1);
			System.out.println("Second Root is:"+r2);
		}else if(d>0) {
			r1=((-b+Math.sqrt(d))/(2*a));
			r2=((-b-Math.sqrt(d))/(2*a));
			System.out.println("Roots are real and distinct");
			System.out.println("First Root is:"+r1);
			System.out.println("Second Root is:"+r2);
		} else {
			int i=-1;
			double x=-b/(2*a);
			double y=Math.sqrt(d)/(2*a);
			r1=x+(i*y);
			r2=x-(i*y);
			System.out.println("Roots are distinct and imaginary");
			System.out.println("First Root is:"+r1);
			System.out.println("Second Root is:"+r2);
		}
		sc.close();
	}
}
