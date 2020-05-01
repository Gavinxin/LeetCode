package QiNiuYunBiShi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
		int n = Integer.valueOf(s[0]);
		int m = Integer.valueOf(s[1]);
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < m; i++) {
			String[] input = sc.nextLine().split(" ");
			if (set.size() == 0) {
				set.add(input[0]);
				set.add(input[1]);
			}
			if(set.contains(input[0]))
				set.add(input[1]);
		}
		if(set.size() == n || n ==1)
			System.out.println("YES");
		else System.out.println("NO");
	}
}
