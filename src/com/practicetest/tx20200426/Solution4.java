package com.practicetest.tx20200426;

import java.util.Scanner;
import java.util.Stack;

public class Solution4 {
	/**
	 * 75%
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		Stack<String> s1 = new Stack<>();
		Stack<String> s2 = new Stack<>();
		for (int i = 0; i < n; i++) {
			String[] s = sc.nextLine().split(" ");
			if (s[0].equals("add")) {
				while(s2.size()>0)
					s1.add(s2.pop());
				s1.add(s[1]);
				
			}
			if (s[0].equals("poll")) {
				while(s1.size()>0)
					s2.add(s1.pop());
				s2.pop();
			}
			if (s[0].equals("peek")) {
				while(s1.size()>0)
					s2.add(s1.pop());
				System.out.println(s2.peek());
			}

		}
	}
}
