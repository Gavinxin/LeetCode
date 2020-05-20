package com.practicetest.wzyh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		String[] str = new String[n];
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.nextLine();	
		}
		for (int i = 0; i < str.length; i++) {	
			if(isPar(str[i]))
				System.out.println("Cassidy");
			else System.out.println("Eleanore");
		}
	}

	private static boolean isPar(String string) {
		List<Character> list =new ArrayList<>();
		for (int i = 0; i < string.length(); i++) {
			Character c = string.charAt(i);
			if(list.contains(c))
				list.remove(c);
			else list.add(c);
		}
		if(list.size() == 0 || list.size()%2==1)
			return true;
		return false;
	}
}
