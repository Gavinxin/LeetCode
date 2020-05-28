package LeetCodeSolutions;

import java.util.Stack;

public class LeetCode394 {
	/**
	 * 
	 * @param s
	 * @return
	 */
	public String decodeString(String s) {
		if(s.length() == 0) return "";
		StringBuilder sb= new StringBuilder();
		Stack<String> stack = new Stack<>();
		int i = 0;
		while(i<s.length()) {
			if(s.charAt(i)!=']') {
				stack.add(String.valueOf(s.charAt(i)));
				i++;
			}else {
				StringBuilder stemp= new StringBuilder();
				while(!stack.peek().equals("[")) {
					stemp.append(stack.pop());
				}
				stemp = stemp.reverse();
				stack.pop();
				int f = Integer.valueOf(stack.pop());
				StringBuilder t= new StringBuilder();
				for (int j = 0; j < f; j++) {
					t.append(stemp);
				}
				stack.add(t.toString());
				i++;
				System.out.println(stack.size());
			}
			
		}
		while(stack.size()>0) {
			sb.insert(0,stack.pop());
		}
		return sb.toString();
    }
	public static void main(String[] args) {
		LeetCode394 l = new LeetCode394();
		System.out.println(l.decodeString("3[a]2[bc]"));
	}
}
