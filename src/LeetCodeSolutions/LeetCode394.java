package LeetCodeSolutions;

import java.util.Stack;
import java.util.function.BinaryOperator;

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
				stack.stream().reduce("", new BinaryOperator<String>() {
					
					@Override
					public String apply(String arg0, String arg1) {
						// TODO Auto-generated method stub
						return arg0+arg1;
					}
				}).toString();
			}
			
		}
		while(stack.size()>0) {
			sb.insert(0,stack.pop());
		}
		return sb.toString();
    }
	public static void main(String[] args) {
		LeetCode394 l = new LeetCode394();
		System.out.println(l.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));
	}
}
