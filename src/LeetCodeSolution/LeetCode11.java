package LeetCodeSolution;

public class LeetCode11 {
	/**
	 * 11. 盛最多水的容器
	 * 
	 * @param height
	 * @return
	 */
	public int maxArea(int[] height) {
		if (height.length == 2)
			return Math.min(height[0],height[1])*1;
		int l = height.length;
		int max = Integer.MIN_VALUE;
		int i = 0, j = l - 1;
		while (i != j) {
			max = Math.max(max, Math.min(height[i],height[j]) * (j - i));
		}
		if (height[i] < height[j])
			i++;
		else
			j--;
		return max;
	}
}
