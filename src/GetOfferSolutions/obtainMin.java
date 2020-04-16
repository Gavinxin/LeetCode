package GetOfferSolutions;

import java.util.Stack;

public class obtainMin {
	Stack<Integer> s = new Stack<>();
	Stack<Integer> sMin = new Stack<>();
    
    public void push(int node) {
        s.push(node);
        if(sMin.isEmpty())
        	sMin.push(node);
        else if(node<sMin.peek())
        	sMin.push(node);
    }
    
    public void pop() {
    	if(s.isEmpty())
    		return;
        int pop = s.pop();
        if(pop == sMin.peek())
        	sMin.pop();
    }
    
    public int top() {
    	if(!s.isEmpty())
    		return s.peek();
		return 0;
        
    }
    
    public int min() {
		return sMin.peek();
        
    }
    public static void main(String[] args) {
    	obtainMin o = new obtainMin();
    	o.push(3);
    	o.push(2);
    	System.out.println(o.min());
	}
}
