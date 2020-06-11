package LeetCodeSolutions;

import java.util.Stack;

public class LeetCode739 {
	/**
	 * 739. ÿ���¶�
	 * ����ջ������ά��һ���洢�±�ĵ���ջ����ջ�׵�ջ�����±��Ӧ���¶��б��е��¶����εݼ�
	 * @param T
	 * @return
	 */
	public int[] dailyTemperatures(int[] T) {
		int[] res = new int[T.length];
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < res.length; i++) {
			while(!stack.isEmpty()&&T[i]>T[stack.peek()]) {
                int index= stack.pop();
				res[index] = i-index;
			}
			stack.add(i);
		}
		while(!stack.isEmpty())
			res[stack.pop()] = 0;
		return res;
    }
}
