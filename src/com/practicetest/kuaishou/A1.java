package com.practicetest.kuaishou;

import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String str = sc.nextLine();
		long result = 0;
		int[] dp = new int[k + 2];
		int num = 0, len = str.length();
		dp[0] = 1;
		for (char c : str.toCharArray()) {
			if (c == '1')
				num++;
			if (num - k >= 0)
				result += dp[(num - k) % (k + 2)];
			dp[(num + 1) % (k + 2)] = 0;
			dp[num % (k + 2)]++;
		}
		System.out.println(result);
	}
}
