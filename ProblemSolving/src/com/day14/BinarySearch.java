package com.day14;
import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size=sc.nextInt();
		System.out.println("Enter elements of an array:");
		int[] a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter a tagert value:");
		int target=sc.nextInt();
		int start=0;
		int end=a.length-1;
		boolean status=false;
		int index=-1;
		int occurance=0;
		int count=0;
		while(start<=end) {
			int midIndex=(start+end)/2;
			count++;
			if(a[midIndex]==target) {
				occurance++;
				status=true;
				index=midIndex;
				if(occurance>=2) {
					break;
				}
				break;
			} else if(a[midIndex]<target) {
				start=midIndex+1;
			} else {
				end=midIndex-1;
			}
		}
		if(status) {
			System.out.println("Element found ,"+count+" iterations , only "+ occurance + " time occurs,"+ " at index:"+index);
		} else {
			System.out.println("Element not found");
		}
		sc.close();
	}
}
