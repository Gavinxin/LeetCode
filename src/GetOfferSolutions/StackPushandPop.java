package GetOfferSolutions;

import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

public class StackPushandPop {
	public static void main(String[] args) {
		int[] pushA = { 1, 2, 3, 4, 5 };
		int[] popA = { 4, 3, 5, 1, 2 };
		boolean b = IsPopOrder(pushA, popA);
		System.out.println(b);
	}

	public static boolean IsPopOrder(int[] pushA, int[] popA) {

		if (pushA.length == 0 || popA.length == 0 || popA.length != pushA.length)
			return false;
		Stack<Integer> stack = new Stack<>();
		int j = 0;
		for (int i = 0; i < pushA.length; i++) {
			stack.push(pushA[i]);

			while (!stack.isEmpty() && stack.peek() == popA[j]) {
				stack.pop();
				j++;
			}
		}
		return stack.isEmpty();
	}
}
