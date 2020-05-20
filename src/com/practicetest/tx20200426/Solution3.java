package com.practicetest.tx20200426;

import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();
		boolean boo =false;
		int cnt = 0;
		while(!boo) {
			for (int i = 1; i < b.length; i++) {
				if(a[i-1]>a[i] && b[i-1]<=b[i]) {
					int temp = a[i];
					a[i] = b[i-1];
					b[i-1] = temp;
					int temp1 = a[i-1];
					a[i-1] = b[i];
					b[i] = temp;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
