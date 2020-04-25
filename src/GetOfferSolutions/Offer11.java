package GetOfferSolutions;

import HWInterview.Solution1.num;

public class Offer11 {
	/**
	 * 面试题11. 旋转数组的最小数字
	 * @param numbers
	 * @return
	 */
	public int minArray(int[] numbers) {
		int i = 1;
		for (; i < numbers.length; i++) {
			if(numbers[i]<numbers[i-1])
				return numbers[i];
		}
		return numbers[0];
    }
}
