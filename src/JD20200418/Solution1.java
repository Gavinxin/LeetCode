package JD20200418;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<Integer, List<int[]>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			List<int[]> list = new ArrayList<>();
			for (int j = 0; j < 6; j++) {
				list.add(new int[] { in.nextInt(), in.nextInt() });
			}
			map.put(i, list);
		}
		for (Integer key : map.keySet()) {
			boolean res = true;
			List<int[]> list = map.get(key);
			HashMap<Integer, Integer> mapTemp = new HashMap<>();
			for (int i = 0; i < list.size(); i++) {
				int[] temp = list.get(i);
				for (int j : temp) {
					if (mapTemp.containsKey(j))
						mapTemp.put(j, mapTemp.get(j) + 1);
					else
						mapTemp.put(j, 1);
				}
			}
			for (Integer k : mapTemp.keySet()) {
				// System.out.println(k+" "+mapTemp.get(k));
				if (mapTemp.get(k) % 4 != 0)
					res = false;
			}
			System.out.println(String.valueOf(res ? "POSSIBLE" : "IMPOSSIBLE"));
		}

	}

}
