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
					stemp.insert(0,stack.pop());
				}
				stack.pop();
				// consider mul number
				StringBuilder num= new StringBuilder();
				while(stack.size()>0&&Character.isDigit(stack.peek().charAt(0))) {
					num.insert(0,stack.pop());
				}
				int f = Integer.valueOf(num.toString());
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
		System.out.println(l.decodeString("3[a2[c]]"));
	}
}
