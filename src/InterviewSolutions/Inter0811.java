package InterviewSolutions;

public class Inter0811 {
	/**
	 * Ӳ�� 25�� 10�� 5�� 1��
	 * @param n
	 * @return
	 */
public int waysToChange(int n) {
        
        int[] dp = new int[n + 1];
        
        int[] coins = new int[]{1,5,10,25};
        
        
        //�պÿ�����һ��Ӳ�Ҵճɵ��������һ�����
        // while i == coin :
        //dp[i] = dp[i - coin] => dp[0]
        dp[0] = 1;
        
        /**
        * dp���̣�dp[i] += dp[i - coin];
        */
        
        for(int coin : coins) {
            for(int i = coin; i <= n; i++) {
                dp[i] = (dp[i] + dp[i - coin]) % 1000000007;
            }
        }
        
        return dp[n];
    }
	public static void main(String[] args) {
		Inter0811 i =new Inter0811();
		System.out.println(i.waysToChange(10));
	}
}
