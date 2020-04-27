package TX20200426;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution5 {
	/**
	 * 100%
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Long x =sc.nextLong();
			int k =sc.nextInt();
			List<Long> list = new ArrayList<>();
			while(x/2!=0) {
				list.add(x/2);
				x =x/2;
			}
			if(list.size()<k)
				System.out.println(-1);
			else System.out.println(list.get(list.size()-k));
		}
	}
}
