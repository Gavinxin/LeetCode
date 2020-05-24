package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode406 {
	 /**
     * 解题思路：先排序再插入
     * 1.排序规则：按照先H高度降序，K个数升序排序
     * 2.遍历排序后的数组，根据K插入到K的位置上
     *
     * 核心思想：高个子先站好位，矮个子插入到K位置上，前面肯定有K个高个子，矮个子再插到前面也满足K的要求
     *
     * @param people
     * @return
     */
	public int[][] reconstructQueue(int[][] people) {
		if(people.length == 0)
			return new int[0][0];
		Arrays.sort(people,(o1,o2)->o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0]);
		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < people.length; i++) {
			list.add(people[i][1],people[i]);
		}
		return list.stream().toArray(int[][]::new);
    }
}
