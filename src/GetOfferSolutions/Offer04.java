package GetOfferSolutions;

public class Offer04 {
	/**
	 * 面试题04. 二维数组中的查找
	 * @param matrix
	 * @param target
	 * @return
	 */
	public boolean findNumberIn2DArray(int[][] matrix, int target) {
		int n = matrix.length;
		if(n == 0) return false;
		int m = matrix[0].length;
		int row =0, col= m-1;
		while(row <n && col >=0) {
			if(matrix[row][col] == target)
				return true;
			if(matrix[row][col]>target) col--;
			else if(matrix[row][col]<target) row++;
		}
		return false;
		
	}
}
