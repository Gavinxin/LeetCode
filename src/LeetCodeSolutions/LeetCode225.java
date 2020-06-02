package LeetCodeSolutions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode225 {
	/**
	 * 队列实现栈
	 */
	Queue<Integer> q1;
	Queue<Integer> q2;
	int top;
	/** Initialize your data structure here. */
    public void MyStack() {
    	q1 = new LinkedList<Integer>(); 
    	q2 = new LinkedList<Integer>(); 
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	q1.add(x);
    	top = x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	if(q1.isEmpty())
    		return -1;
    	while(q1.size()>1) {
    		top = q1.peek();
    		q2.add(q1.poll());
    	}
    		
    	int res = q1.remove();
    	while(q2.size()>0)
    		q1.add(q2.poll());
		return res;
    }
    
    /** Get the top element. */
    public int top() {
    	return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
    	return q1.isEmpty();
    }
}
