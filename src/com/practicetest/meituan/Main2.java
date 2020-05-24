package com.practicetest.meituan;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = s.nextInt();
		}
		s.close();
		Arrays.sort(nums);
		int cnt = 0;
		while(m>=nums[0]) {
			for (int i = 0; i < nums.length; i++) {
				if(m>=nums[i]) {
					m -=nums[i];
					cnt++;
				}else
					break;
			}
		}
		System.out.println(cnt);
	}
}
