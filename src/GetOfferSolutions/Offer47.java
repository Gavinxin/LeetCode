package GetOfferSolutions;

public class Offer47 {
	/**
	 * 面试题47. 礼物的最大价值
	 * @param grid
	 * @return
	 */
	public int maxValue(int[][] grid) {
		if(grid.length == 0) return 0;
		int[][] maxPrice = new int[grid.length][grid[0].length];
		maxPrice[0][0] = grid[0][0];
		for (int i = 1; i < maxPrice.length; i++) {			
			maxPrice[i][0] = grid[i][0]+maxPrice[i-1][0];
		}
		for (int i = 1; i < grid[0].length; i++) {
			maxPrice[0][i] = grid[0][i]+maxPrice[0][i-1];
		}
		for (int i = 1; i < maxPrice.length; i++) {
			for (int j = 1; j < maxPrice[0].length; j++) {
				maxPrice[i][j] = Math.max(maxPrice[i-1][j], maxPrice[i][j-1])+grid[i][j];
			}
		}
		return maxPrice[grid.length-1][grid[0].length-1];
    }
}
