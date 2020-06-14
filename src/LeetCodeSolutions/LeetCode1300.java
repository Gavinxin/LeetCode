package LeetCodeSolutions;

import java.util.Arrays;

public class LeetCode1300 {
	/**
	 * 1300. 转变数组后最接近目标值的数组和
	 * @param arr
	 * @param target
	 * @return
	 */
	public int findBestValue(int[] arr, int target) {
		Arrays.sort(arr);
		int delta = Integer.MAX_VALUE;
		int i = 0;
		int sum = 0,len = arr.length;
		int res = 0;
		while(i<arr.length) {
			if(sum+(len-i)*arr[i]>target)
				break;
			if(sum+(len-i)*arr[i]==target)
				return arr[i];
			sum += arr[i];
			i++;
		}
		if(i == len)
			return arr[len-1];
		if(i==0)
			return arr[0];
		for (int j = i==0?0:arr[i-1]; j <= (i==0?arr[0]:arr[i+1]); j++) {
			int temp  = Math.abs(sum+(len-i)*j - target);
			if(delta>temp) {
				delta = temp;
				res = j;
			}
		}
		return res;
    }
	public static void main(String[] args) {
		LeetCode1300 l = new LeetCode1300();
		System.out.println(l.findBestValue(new int[] {4,3,9}, 10));
	}
}
