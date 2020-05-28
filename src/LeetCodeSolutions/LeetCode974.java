package LeetCodeSolutions;

import java.util.HashMap;
import java.util.Map;

public class LeetCode974 {
	/**
	 * 974. �Ϳɱ� K ������������
	 * @param A
	 * @param K
	 * @return
	 */
	public int subarraysDivByK(int[] A, int K) {
		 Map<Integer,Integer> map = new HashMap<>();
		 //Ԥ������ǰ׺�����������
		 map.put(0, 1);
		 int sum= 0;
		 int count = 0;
		 for (int i : A) {
			sum+=i;
			//���Ǹ��������
			int m = (sum%K+K)%K;
			int s = map.getOrDefault(m, 0);
			count +=s;
			map.put(m, s+1);
		}
		return count;
	}
}
