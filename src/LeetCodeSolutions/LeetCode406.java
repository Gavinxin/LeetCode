package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode406 {
	 /**
     * ����˼·���������ٲ���
     * 1.������򣺰�����H�߶Ƚ���K������������
     * 2.�������������飬����K���뵽K��λ����
     *
     * ����˼�룺�߸�����վ��λ�������Ӳ��뵽Kλ���ϣ�ǰ��϶���K���߸��ӣ��������ٲ嵽ǰ��Ҳ����K��Ҫ��
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
