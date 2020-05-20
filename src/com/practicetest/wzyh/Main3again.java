package com.practicetest.wzyh;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main3again {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][2];
		for (int i = 0; i < n; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();	
		}
		Arrays.sort(a,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[1]==o2[1]?o1[0]-o2[0]:o1[1]-o2[1];
			}
		});
		int[] dp = new int[n];
		for (int i = 0; i < a.length; i++) {
			if(a[i][1] == 0)
				dp[i] = 0;
			else 
				for (int j = 0; j < dp.length; j++) {
					
				}
		}
		
	}
}
