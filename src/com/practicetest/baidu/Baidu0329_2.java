package com.practicetest.baidu;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baidu0329_2 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int in = sc.nextInt();
	        int i = 0;
	        int cnt = 0;
	        int[] input = new int[in];
	        for (int j = 0; j < in; j++) {
	        	input[i++] = sc.nextInt();
			}
	        int length = input.length;
	         Arrays.sort(input);
	         int max = input[length-1];
	        while(max>=in) {
	        	cnt++;
	        	input[length-1] -=in;
	        	for (int j = 0; j < input.length-1; j++) {
					input[j]++;
				}
	        	Arrays.sort(input);
		        max = input[length-1];
	        }
	        System.out.println(cnt);
	    }
}
