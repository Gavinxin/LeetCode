package LeetCodeSolution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode986 {
	/**
	 * �����б�Ľ��� ����������һЩ��������ɵ��б�ÿ�������б��ǳɶԲ��ཻ�ģ������Ѿ����� ���������������б�Ľ�����
	 * 
	 * @param A
	 * @param B
	 * @return
	 */
	public int[][] intervalIntersection(int[][] A, int[][] B) {
		if (A.length == 0 || B.length == 0)
			return new int[][] {};
		int i = 0, j = 0;
		List<int[]> ans = new ArrayList<>();
		while (i < A.length && j < B.length) {
			int left = Math.max(A[i][0], B[j][0]);
			int right = Math.min(A[i][1], B[j][1]);
			if (left <= right)
				ans.add(new int[] { left,right  });
			if (A[i][1] < B[j][1])
				i++;
			else
				j++;
		}
		return ans.toArray(new int[ans.size()][]);
	}
}
