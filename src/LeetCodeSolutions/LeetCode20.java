package LeetCodeSolutions;

import java.util.Stack;

public class LeetCode20 {
	/**
	 * 20. ÓÐÐ§µÄÀ¨ºÅ
	 * @param s
	 * @return
	 */
	public boolean isValid(String s) {
		if(s.length() ==0 )return true;
		Stack<Character> stack = new Stack<>(); 
		int i = 0;
		while(i<s.length()) {
			
			if(s.charAt(i) == '(' || s.charAt(i) == '['||s.charAt(i) == '{')
				stack.add(s.charAt(i));
			if(s.charAt(i)==')' )
				if(stack.size()<=0 || stack.peek()!='(')
					return false;
				else 
					stack.pop();
			if(s.charAt(i)==']' )
				if(stack.size()<=0|| stack.peek()!='[')
					return false;
				else 
					stack.pop();
			if(s.charAt(i)=='}' )
				if(stack.size()<=0|| stack.peek()!='{') 
					return false;
				else
					stack.pop();
			i++;
		}
		if(stack.size()>0)
			return false;
		return true;
    }
}
