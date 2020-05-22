package GetOfferSolutions;

import java.util.Arrays;
import java.util.Comparator;

public class Offer45 {
	/**
	 * 面试题45. 把数组排成最小的数
	 * @param nums
	 * @return
	 */
	public String minNumber(int[] nums) {
		Comparator<Integer> com = (n1,n2)->String.valueOf(n1+""+n2).compareTo(String.valueOf(n2+""+n1));
		Integer[] numss = Arrays.stream(nums).boxed().toArray(Integer[]::new);
		Arrays.sort(numss, com);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numss.length; i++) {
			sb.append(numss[i]);			
		}
		return sb.toString();
    }
}
