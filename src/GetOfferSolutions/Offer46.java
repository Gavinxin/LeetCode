package GetOfferSolutions;

public class Offer46 {
	/**
	 * 
	 * @param num
	 * @return
	 */
	public int translateNum(int num) {
		String str = String.valueOf(num);
		if(str.length() == 1)
			return 1;
		int[] dp = new int[str.length()+1];
		dp[0] = 1;
        dp[1] = Integer.valueOf(str.substring(0,2))<=25&&Integer.valueOf(str.substring(0,2))>=10?2:1;
        for (int i = 2; i < str.length(); i++) {
			dp[i] = dp[i-1];
			String temp = str.substring(i-1,i+1);
			if(Integer.valueOf(temp)<=25&&Integer.valueOf(temp)>=10&&i-1>0)
				dp[i] += dp[i-2];
		}
		return dp[str.length()-1];
    }
	public static void main(String[] args) {
		Offer46 offer = new Offer46();
		System.out.println(offer.translateNum(1234));
		String str = "aaa";
		System.out.println(str.substring(0,3));
	}
}
