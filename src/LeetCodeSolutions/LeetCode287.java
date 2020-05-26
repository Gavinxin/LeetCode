package LeetCodeSolutions;

public class LeetCode287 {
	/**
	 * 
	 * @param nums
	 * @return
	 */
	/**
	 * (1) ��������Ԫ�ظ����Լ���ֵ��Χ��ȷ��������ʹ�ö��ֲ�������ֵ��Χ�ڱ����ظ�����
(2) ��˵���Ƕ�Ӧһ����Χ����ֵ m �����С�ڵ��� m ��Ԫ�ظ������� m �����ʾ 1 �� m �������ظ���ֵ��
(3) ���������ǣ����С�ڵ��� m ��Ԫ�ظ���С�ڵ��� m ������� m ����ֵ����һ�����ظ������������Ƴ��ȵ���������ֵ�ᳬ�� n - 1 ��
(4) ʹ�ö��ֲ��ұ����ҵ����յ� m ֵ���ء�
	 * @param nums
	 * @return
	 */
	public int findDuplicate(int[] nums) {
		int len = nums.length;
		int left = 0,right =len-1,res = -1;
		while(left<=right) {
			int mid = left+(right-left)/2;
			int count = 0;
			for (int i = 0; i <= len; i++) {				
				if(nums[i]<=mid)
					count++;
			}
			if(count>mid) {
				right = mid-1;
				res = mid;
			}
				
			else left = mid+1;
		}
		return res;
    }
	public int findDuplicate1(int[] nums) {
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			for (int j = i+1; j < len; j++) {
				if(nums[i]==nums[j])
					return nums[i];
			}
		}
		return 0;
    }
}
