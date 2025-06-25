package com.day15;

import java.util.Scanner;

public class ScalerMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size of an array:");
		int rowSize=sc.nextInt();
		System.out.println("Enter the col size of an array");
		int colSize=sc.nextInt();
		System.out.println("Enter elements of an array:");
		int[][] a= new int[rowSize][colSize];
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		if(rowSize != colSize) {
			System.out.println("It is not a Scalar Matrix (not a square matrix)");
		}
		boolean checkPoint=true;
		int value=a[0][0];
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				if(i!=j && a[i][j]!=0) {
					checkPoint=false;
				}
				else if(i==j && a[i][j]!=value) {
					checkPoint=false;
				}
			}
		}
		if(checkPoint) {
			System.out.println("It is a Scaler Matrix");
		} else {
			System.out.println("It is not Scaler Matrix");
		}
		sc.close();
	}
}
