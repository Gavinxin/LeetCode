package com.practicetest.meituan;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = s.nextInt();
		}
		s.close();
		Arrays.sort(nums);
		int right = n-1,left = 0;
		int cnt =0;
		while(nums[right]-nums[left]>x&&right-left>=1) {
				if((nums[right]-nums[left+1])>=nums[right-1]-nums[left])
					right--;
				else left++;
				cnt++;
			
		}
		System.out.println(cnt);
		
	}
	
}
