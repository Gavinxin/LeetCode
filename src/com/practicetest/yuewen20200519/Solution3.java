package com.practicetest.yuewen20200519;
import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(",");
		long[] nums = new long[input.length];
		long ss = 1;
		long max = Long.MIN_VALUE;
		int index=-1;
		for (int i = 0; i < input.length; i++) {
			nums[i] = Long.valueOf(input[i]);
			if(nums[i]==0) {
				index = i;
				break;
			}
				
			ss = ss*nums[i];
		}
		if(index==-1)
		for (int i = nums.length-1; i >=0 ; i--) {
			if(max<=ss/nums[i]) {
				index = i;
				max = ss/nums[i];
			}
		}
		System.out.println(index);
		
	}
}
