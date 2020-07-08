package InterviewSolutions;

import java.util.HashSet;
import java.util.Set;

public class Solution_16_11 {
	/**
	 * ÃæÊÔÌâ 16.11. ÌøË®°å
	 * @param shorter
	 * @param longer
	 * @param k
	 * @return
	 */
	public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        int[] lengths = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            lengths[i] = shorter * (k - i) + longer * i;
        }
        return lengths;
    }
}
