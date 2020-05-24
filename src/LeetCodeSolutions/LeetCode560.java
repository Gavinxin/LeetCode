package LeetCodeSolutions;

public class LeetCode560 {
	/**
	 * 560. 和为K的子数组
	 * @param nums
	 * @param k
	 * @return
	 */
	public int subarraySum(int[] nums, int k) {
		int cnt = 0;
		if(nums.length == 0 ) return cnt;
		for (int i = 0; i < nums.length; i++) {
			int sum= 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				if(sum == k ) cnt++;
			}
		}
		return cnt;

    }
	public static void main(String[] args) {
		int nums[] = new int[] {1,1,1};
		LeetCode560 l =new LeetCode560();
		System.out.println(l.subarraySum(nums, 2));
	}
}
