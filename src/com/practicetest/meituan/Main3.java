package com.practicetest.meituan;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		float[] p = new float[n];
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = s.nextFloat();
		}
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		s.close();
		float score = 0.0f;
		for (int i = 0; i < n; i++) {
			System.out.println(a[0]+" "+p[i]);
			score += a[0]*(Math.pow(p[0], i+1));
		}
		int[] dp =new int[n];
		
		System.out.println(score);
	}
}
