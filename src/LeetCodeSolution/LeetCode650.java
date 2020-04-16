package LeetCodeSolution;

import java.util.Arrays;

public class LeetCode650 {
	/**
	 * ֻ���������ļ���
	 * @param n
	 * @return
	 */
	public int minSteps(int n) {
		 int ans = 0, d = 2;
	        while (n > 1) {
	            while (n % d == 0) {
	                ans += d;
	                n /= d;
	            }
	            d++;
	        }
	        return ans;
    }
	public static void main(String[] args) {
		LeetCode650 l =new LeetCode650();
		System.out.println(l.minSteps(8));
		
	}
}
