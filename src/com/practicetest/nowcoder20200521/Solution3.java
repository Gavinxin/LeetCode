package com.practicetest.nowcoder20200521;

import java.util.Scanner;

public class Solution3 {
	/**
	 * 没做出来
	 * 找出符合的个数 YYYYY
	 * 5->12
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		long start=1;
		for (int i = 2; i <= n; i++) {
			int j = i-1;
			for (; j >1; j--) {
				if(i%j == 0)
					break;
			}
			if(j==1) start = 2*start%1000000007;
			else start = start*3/2%1000000007;
		}
		System.out.println(start);
	}
}
