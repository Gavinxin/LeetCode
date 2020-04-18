package Competition20200418;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Solution2 {
	/**
	 * 传递信息
	 * 小朋友 A 在和 ta 的小伙伴们玩传信息游戏，游戏规则如下：
有 n 名玩家，所有玩家编号分别为 0 ～ n-1，其中小朋友 A 的编号为 0
每个玩家都有固定的若干个可传信息的其他玩家（也可能没有）。传信息的关系是单向的（比如 A 可以向 B 传信息，但 B 不能向 A 传信息）。
每轮信息必须需要传递给另一个人，且信息可重复经过同一个人
	 * @param n
	 * @param relation
	 * @param k
	 * @return
	 */
	
	public int numWays(int n, int[][] relation, int k) {
		Map<Integer,List<Integer>> map =new HashMap<>();
		for (int i = 0; i < relation.length; i++) {
			List<Integer> list = map.getOrDefault(relation[i][0], new ArrayList<Integer>());
			list.add(relation[i][1]);
			map.put(relation[i][0], list);
		}
		int sum = 0;
		Queue<Integer> queue = new LinkedList<>();
		if(map.containsKey(0))
			for (Integer key : map.get(0)) {
				queue.add(key);
			}
		while(k>1) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int temp =queue.poll();
				if(map.containsKey(temp))
					for (Integer key : map.get(temp)) {
						queue.add(key);
					}
			}
			k--;
		}
		while(queue.size()>0) {
			int temp =queue.poll();
			if(temp == n-1)
				sum++;
		}
		return sum;
    }
	public static void main(String[] args) {
		Solution2 s2 = new Solution2();
		int[][] relation = new int[][]{{0,2},{2,1},{3,4},{2,3},{1,4},{2,0},{0,4}};
		System.out.println(s2.numWays(5, relation, 3));
	}

	
}
