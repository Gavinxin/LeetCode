package LeetCodeSolutions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LeetCode84 {
	/**
	 * 84. ��״ͼ�����ľ���
	 * ����ջ
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
			// ջ��Ԫ�ش�������������鵱ǰ����Ԫ�����ջ���������
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
