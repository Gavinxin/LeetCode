package LeetCodeSolutions;

import java.util.Arrays;

public class LeetCode1371 {
	/**
	 * 1371. 每个元音包含偶数次的�?长子字符�?
	 * @param s
	 * @return
	 */
	public int findTheLongestSubstring(String s) {
        int n = s.length();
        // 五位代表5个元音奇偶�??
       /* 我们对每个元音字母维护一个前�?和，定义 \textit{pre}[i][k]pre[i][k] 表示在字符串�?
        ii 个字符中，第 kk 个元音字母一共出现的次数。假设我们需要求�? [l,r][l,r] 这个区间�?
        子串是否满足条件，那么我们可以用 pre[r][k]-pre[l-1][k]pre[r][k]−pre[l�?1][k]�?
        �? O(1)O(1) 的时间得到第 kk 个元音字母出现的次数。对于每�?个元音字母，
        我们都判断一下其是否出现偶数次即可�??*/

        
        int[] pos = new int[1 << 5];
        Arrays.fill(pos, -1);
        int ans = 0, status = 0;
        pos[0] = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a') {
                status ^= (1 << 0);
            } else if (ch == 'e') {
                status ^= (1 << 1);
            } else if (ch == 'i') {
                status ^= (1 << 2);
            } else if (ch == 'o') {
                status ^= (1 << 3);
            } else if (ch == 'u') {
                status ^= (1 << 4);
            }
            if (pos[status] >= 0) {
                ans = Math.max(ans, i + 1 - pos[status]);
            } else {
                pos[status] = i + 1;
            }
        }
        return ans;
    }

}
