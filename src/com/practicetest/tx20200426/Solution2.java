package com.practicetest.tx20200426;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution2 {
	/**
	 * 10%
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println(Double.MAX_VALUE);
		int n = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < n; i++) {
			int m = Integer.valueOf(sc.nextLine());
			double[][] a = new double[m][2];
			for (int j = 0; j < m; j++) {
				String[] s = sc.nextLine().split(" ");
				a[j][0] = Double.valueOf(s[0]);
				a[j][1] = Double.valueOf(s[1]);
			}
			double[][] b = new double[m][2];
			for (int j = 0; j < m; j++) {
				String[] s = sc.nextLine().split(" ");
				b[j][0] = Double.valueOf(s[0]);
				b[j][1] = Double.valueOf(s[1]);
			}
			
			double mindis = Double.MAX_VALUE;
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < m; k++) {					
					double temp = (a[j][0]-b[k][0])*(a[j][0]-b[k][0])+(a[j][1]-b[k][1])*(a[j][1]-b[k][1]);
					mindis =  temp < mindis?temp:mindis;
				}
			}
			double t = Math.sqrt(mindis);
			DecimalFormat df = new DecimalFormat("0.000");
			System.out.println(df.format(t));
		}
	}
}
