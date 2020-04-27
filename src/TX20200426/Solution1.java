package TX20200426;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution1 {
	/**
	 * 100%
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < n; i++) {
			int step = Integer.valueOf(sc.nextLine());
			Queue<String> queue = new LinkedList<String>();
			for (int j = 0; j < step; j++) {
				String[] s = sc.nextLine().split(" ");
				if (s[0].equals("PUSH"))
					queue.add(s[1]);
				if (s[0].equals("TOP")) {
					String top = "-1";
					if (queue.size() > 0)
						top = queue.peek();
					System.out.println(top);
				}
				if (s[0].equals("POP")) {
					if (queue.size() > 0)
						queue.poll();
					else
						System.out.println(-1);
				}
				if (s[0].equals("SIZE") ){
					System.out.println(queue.size());
				}
				if (s[0].equals("CLEAR"))
					queue.clear();
			}
		}
	}
}
