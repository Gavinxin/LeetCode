package Competition20200418;

public class Solution1 {
	/**
	 * ��Ӳ��
	 * ������ n �����۱ң�ÿ�ѵ��������������� coins �С�����ÿ�ο���ѡ������һ�ѣ��������е�һö������ö���������������۱ҵ�����
	 * @param coins
	 * @return
	 */
	public int minCount(int[] coins) {
		int cnt =0;
		for (int i = 0; i < coins.length; i++) {
			cnt = coins[i]+1/2;
		}
		return cnt;
    }
}
