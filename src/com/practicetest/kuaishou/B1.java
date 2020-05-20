package com.practicetest.kuaishou;

import java.util.Scanner;

public class B1 {

	private static int diff = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}
		dfs(nums, 0, 0, 0);
		System.out.println(diff);
	}

	private static void dfs(int[] nums, int level, int sum1, int sum2) {
		if (level == nums.length) {
			if (Math.abs(sum1 - sum2) < diff) {
				diff = Math.abs(sum1 - sum2);
			}
			return;
		}
		int temp = nums[level];
		dfs(nums, level + 1, sum1 + temp, sum2);
		dfs(nums, level + 1, sum1, sum2 + temp);

	}

}
