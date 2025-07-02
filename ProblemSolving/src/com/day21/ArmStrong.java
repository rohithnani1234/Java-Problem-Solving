package com.day21;

public class ArmStrong {
	public static void armstrong() {
		int[] a= {153,143,567,896};
		int sum;
		int rem=0;
		int power=0;
		String[] arm=new String[a.length];
		boolean[] status=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			sum=0;
			int num=a[i];
			int temp=num;
			while(num!=0) {
				rem=num%10;
				power=(int)Math.pow(rem, 3);
				sum=power+sum;
				num=num/10;
			}
			if(temp==sum) {
				arm[i]="arm";
				status[i]=true;
			} else {
				arm[i]="notarm";
				status[i]=false;
			}
		}
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]+"->"+arm[j]+"->"+status[j]);
		}
	}
	public static void main(String[] args) {
		armstrong();
	}
}
