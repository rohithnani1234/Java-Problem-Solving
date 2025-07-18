package com.day31;
import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row1=3;
		int col1=3;
		int row2=3;
		int col2=3;
		if(col1!=row2) {
			System.out.println("Matrix multiplication is not posible");
		} else {
			int[][] a=new int[row1][col1];
			int[][] b=new int[row2][col2];
			int[][] c=new int[row1][col2];
			System.out.println("First Matrix is:");
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col1;j++) {
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Second Matrix is:");
			for(int i=0;i<row2;i++) {
				for(int j=0;j<col2;j++) {
					b[i][j]=sc.nextInt();
				}
			}
			System.out.println("Matrix Multiplication is:");
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col2;j++) {
					c[i][j]=0;
					for(int k=0;k<col1;k++) {
						c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
					}
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
