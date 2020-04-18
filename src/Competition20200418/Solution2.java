package Competition20200418;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Solution2 {
	/**
	 * ������Ϣ
	 * С���� A �ں� ta ��С������洫��Ϣ��Ϸ����Ϸ�������£�
�� n ����ң�������ұ�ŷֱ�Ϊ 0 �� n-1������С���� A �ı��Ϊ 0
ÿ����Ҷ��й̶������ɸ��ɴ���Ϣ��������ң�Ҳ����û�У�������Ϣ�Ĺ�ϵ�ǵ���ģ����� A ������ B ����Ϣ���� B ������ A ����Ϣ����
ÿ����Ϣ������Ҫ���ݸ���һ���ˣ�����Ϣ���ظ�����ͬһ����
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
