package com.practicetest.huawei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test3 {
	static int  max = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int[] cnt =new int[n+1];
		int[] store =new int[n+1];
		for (int i = 1; i <= n; i++) {
			cnt[i] = sc.nextInt();
		}
		HashMap<Integer,List<Integer>> map =new HashMap<>();
		for (int i = 1; i <= n; i++) {
			int k = sc.nextInt();
			store[i] = sc.nextInt();
			for (int j = 0; j < cnt[i]; j++) {
				List<Integer> list = map.getOrDefault(k, new ArrayList<Integer>());
				list.add(sc.nextInt());
				map.put(k, list);
			}
			
	
		}
		int sco =store[1];
		DFS(1,map,sco,store);
		System.out.println(max);
		
	}
	private static void DFS(int i, HashMap<Integer, List<Integer>> map, int sco, int[] store) {
		if(!map.containsKey(i)) {
			max = Math.max(max, sco+store[i]);
		}
		else
		for (int j : map.get(i)) {
			DFS(j,map,sco,store);
		} 
		
	}
	
}
