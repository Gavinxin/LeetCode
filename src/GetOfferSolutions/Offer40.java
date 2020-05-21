package GetOfferSolutions;

import java.util.PriorityQueue;

public class Offer40 {
	/**
	 * 面试题40. 最小的k个数
	 * @param arr
	 * @param k
	 * @return
	 */
	public int[] getLeastNumbers(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((n1,n2)->n2-n1);
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		int[] res = pq.stream().mapToInt(Integer::valueOf).toArray();
		return res;
    }
}
