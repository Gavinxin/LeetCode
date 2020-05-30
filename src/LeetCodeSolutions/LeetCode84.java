package LeetCodeSolutions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LeetCode84 {
	/**
	 * 84. 柱状图中最大的矩形
	 * 单调栈
	 * @param heights
	 * @return
	 */
	public int largestRectangleArea(int[] heights) {
		int len = heights.length;
		if(len==0) return 0;
		if(len==1) return heights[0];
		Deque<Integer> deque = new ArrayDeque<>();
		int area = 0;
		for (int i = 0; i < heights.length; i++) {
			// 栈顶元素代表的数大于数组当前遍历元素则出栈，计算面积
			while(!deque.isEmpty()&&heights[deque.peekLast()]>heights[i]) {
				int height = heights[deque.removeLast()];
				int width= 0;
				if(deque.isEmpty())
					width = i;
				else width = i-deque.peekLast()-1;
				area = Math.max(area, height*width); 
			}
			
			deque.add(i);
		}
		while(!deque.isEmpty()) {
			int height = heights[deque.removeLast()];
			int width= 0;
			if(deque.isEmpty())
				width = len;
			else width = len-deque.peekLast()-1;
			area = Math.max(area, height*width); 
		}
		return area;
    }
}
