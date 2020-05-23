package LeetCodeSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode406 {
	/**
	 * 406. 根据身高重建队列
	 * @param people
	 * @return
	 */
	public int[][] reconstructQueue(int[][] people) {
		Arrays.sort(people,(o1,o2)->o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0]);
		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < people.length; i++) {
			list.add(people[i][1],people[i]);
		}
		return list.stream().toArray(int[][]::new);
    }
}
