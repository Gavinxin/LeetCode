package LeetCodeSolutions;

public class LeetCode55 {
	/**
	 *  ��Ծ��Ϸ
	 *  ����һ���Ǹ��������飬�����λ������ĵ�һ��λ�á�
		�����е�ÿ��Ԫ�ش������ڸ�λ�ÿ�����Ծ����󳤶ȡ�
		�ж����Ƿ��ܹ��������һ��λ�á�
	 * @param nums
	 * @return
	 */
	public boolean canJump(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
        	return true;
        int dp[] = new int[nums.length];
        dp[0] =nums[0];
        for (int i = 1; i < nums.length; i++) {
			if(i<=dp[i-1]) 
				dp[i] = Math.max(dp[i-1], i + nums[i]);
			if(dp[i]>=nums.length-1)
				return true;
		}
        return false;
    }
}
