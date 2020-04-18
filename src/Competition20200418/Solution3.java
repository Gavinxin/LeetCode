package Competition20200418;

import java.util.Arrays;

public class Solution3 {
	/**
	 * 剧情出发时间
	 * @param increase
	 * @param requirements
	 * @return
	 */
	public int[] getTriggerTime(int[][] increase, int[][] requirements) {
		for (int i = 1; i < increase.length; i++) {
			increase[i][0] += increase[i-1][0];
			increase[i][1] += increase[i-1][1];
			increase[i][2] += increase[i-1][2];
		}
		int[] res = new int[requirements.length];
		Arrays.fill(res, -1);
		for (int i = 0; i < requirements.length; i++) {
			for (int j = 0; j < increase.length; j++) {
				if(requirements[i][0]==0 && requirements[i][1]==0&&requirements[i][2]==0)
				{
					res[i]=0;
					break;
				}
				if(requirements[i][0] <= increase[j][0] && requirements[i][1] <= increase[j][1]&&requirements[i][2] <= increase[j][2])
					{
						res[i]=j+1;
						break;
					}
			}
		}
		return res;
    }
}
