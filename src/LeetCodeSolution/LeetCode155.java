package LeetCodeSolution;

import java.util.Stack;

public class LeetCode155 {
	private Stack<Integer> stack;
	private Stack<Integer> minStack;

	public void MinStack() {
	        stack = new Stack<>();
	        minStack = new Stack<>();
	}

	
    
    public void push(int x) {
    	stack.push(x);
    	if(minStack.isEmpty() || x<=minStack.peek())
    		minStack.push(x);
    }
    
    public void pop() {
    	int x = stack.size()>0?stack.pop():null;
    	if(minStack.size()>0&&x==minStack.peek())
    		minStack.pop();
    }
    
    public int top() {
    	return stack.size()>0?stack.peek():null;
    }
    
    public int getMin() {
    	return minStack.size()>0?minStack.peek():null;
    }
}
