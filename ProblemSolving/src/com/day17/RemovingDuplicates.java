package com.day17;

public class RemovingDuplicates {
	public static void main(String[] args) {
		int[] a= {1,2,4,3,7,4,5,5,6};
		int size=a.length;
		int[] uniques=new int[size];
		int uniqueIndex=0;
		for(int i=0;i<size;i++) {
			boolean isDuplicate=false;
			for(int j=0;j<uniqueIndex;j++) {
				if(a[i]==uniques[j]) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				uniques[uniqueIndex]=a[i];
				uniqueIndex++;
			}
		}
		for(int i=0;i<uniqueIndex;i++) {
			System.out.println(uniques[i]);
		}
	}
}
