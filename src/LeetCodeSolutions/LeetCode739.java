package LeetCodeSolutions;

import java.util.Stack;

public class LeetCode739 {
	/**
	 * 739. 每日温度
	 * 单调栈，可以维护一个存储下标的单调栈，从栈底到栈顶的下标对应的温度列表中的温度依次递减
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
