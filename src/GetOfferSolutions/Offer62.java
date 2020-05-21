package GetOfferSolutions;

import java.util.ArrayList;

public class Offer62 {
	/**
	 * 面试题62. 圆圈中最后剩下的数字
	 * @param n
	 * @param m
	 * @return
	 */
	 public int lastRemaining(int n, int m) {
	        ArrayList<Integer> list = new ArrayList<>(n);
	        for (int i = 0; i < n; i++) {
	            list.add(i);
	        }
	        int idx = 0;
	        while (n > 1) {
	            idx = (idx + m - 1) % n;
	            list.remove(idx);
	            n--;
	        }
	        return list.get(0);
	    }

}
