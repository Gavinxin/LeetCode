package LeetCodeSolutions;

public class LeetCode45 {
	/**
	 * 45. ��Ծ��Ϸ II
	 * �ڱ�������ʱ�����ǲ��������һ��Ԫ�أ�
	 * ������Ϊ�ڷ������һ��Ԫ��֮ǰ��
	 * ���ǵı߽�һ�����ڵ������һ��λ�ã�
	 * ������޷��������һ��λ���ˡ�����������һ��Ԫ�أ�
	 * �ڱ߽�����Ϊ���һ��λ�õ�����£�
	 * ���ǻ�����һ�Ρ�����Ҫ����Ծ��������������ǲ��ط������һ��Ԫ�ء�
	 * @param nums
	 * @return
	 */
	 public int jump(int[] nums) {
		 if(nums.length == 0)
			 return 0;
		 if(nums.length == 1)
			 return 1;
		 int maxPos = 0;
		 int step = 0;
		 int end = 0;
		 for (int i = 0; i < nums.length-1; i++) {
			maxPos = Math.max(maxPos, nums[i]+i);
			if(i==end) {
				end = maxPos;
				step++;
			}
		 }
		return step;
	 }
}
