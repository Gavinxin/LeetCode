package LeetCodeSolutions;

public class LeetCode1014 {
	/**
	 * 1014. ��ѹ۹����
	 * @param A
	 * @return
	 */
	public int maxScoreSightseeingPair(int[] A) {
		int max = A[0]+0,res = 0;
		for (int j = 1; j < A.length; j++) {
			res = Math.max(res, max +A[j]-j);
			max = Math.max(max, A[j]+j);
		}
		return res;
    }
}
