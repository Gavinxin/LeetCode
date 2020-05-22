package com.practicetest.nowcoder20200521;

import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String input = sc.nextLine();
		int res = 0;
		int len = input.length();
		for (int i = 2; i < input.length(); i = i+2) {
			String temp = input.substring(0,len-i);
			int lentemp = temp.length();
			if(temp.substring(0, lentemp/2).equals(temp.substring(lentemp/2,lentemp))) {
				res = len-i;
				break;
			}
		}
		System.out.println(res);
	}
}
