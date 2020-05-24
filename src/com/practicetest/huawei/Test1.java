package com.practicetest.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String names[] = str.split(",");
		boolean b =true;
		int max = 0;
		if(names.length>=100&&names.length<=0)
			System.out.println("error.0001");
		else {
			HashMap<String,Integer> map =new HashMap<>();
			for (int i = 0; i < names.length; i++) {
				if(!isApl(names[i])) {
					b = false;
					break;
				}else {
					Integer k = map.getOrDefault(names[i], 0)+1;
					map.put(names[i], k);
					max = Math.max(max, k);
				}
			}
			List<String> list = new ArrayList<String>();
			for (String s : map.keySet()) {
				if(map.get(s)==max)
					list.add(s);
			}
			Collections.sort(list);
			if(b) System.out.println(list.get(0));
			else System.out.println("error.0001");
			
		}
	}

	public static boolean isApl(String s) {

		
		if(s == null) return false;
		if(s.charAt(0)<'A' || s.charAt(0)>'Z') return false;
		for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i)<'a'|| s.charAt(i)>'z')
				return false;
		}
		return true;

	}
}
