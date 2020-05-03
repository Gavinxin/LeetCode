package GetOfferSolutions;

import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

public class Offer31 {
	public static void main(String[] args) {
		int[] pushA = { 1, 2, 3, 4, 5 };
		int[] popA = { 4, 3, 5, 1, 2 };
		boolean b = validateStackSequences(pushA, popA);
		System.out.println(b);
	}

	public static boolean validateStackSequences(int[] pushed, int[] popped) {
		if(pushed.length == 0 && popped.length == 0 )
            return true;
		if (pushed.length == 0 || popped.length == 0 || popped.length != pushed.length)
			return false;
		Stack<Integer> stack = new Stack<>();
		int j = 0;
		for (int i = 0; i < pushed.length; i++) {
			stack.push(pushed[i]);

			while (!stack.isEmpty() && stack.peek() == popped[j]) {
				stack.pop();
				j++;
			}
		}
		return stack.isEmpty();
	}
}
