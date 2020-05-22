package com.practicetest.nowcoder20200521;

import java.util.HashMap;
import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[] input = sc.nextLine().split("");
		HashMap<String,Integer> map = new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			if(map.containsKey(input[i]))
				map.remove(input[i]);
			else map.put(input[i], 1);
		}
		System.out.println(map.size());
	}
}
