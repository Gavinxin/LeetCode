package LeetCodeSolutions;

public class LeetCode509 {
	/**
	 * 509. ì³²¨ÄÇÆõÊý
	 * @param N
	 * @return
	 */
	public int fib(int N) {
		int a=0,b=1;
		for (int i = 0; i < N; i++) {
			int temp= a+b;
			a=b;
			b=temp;
		}
		return a;
    }
}
