package GetOfferSolutions;

public class Offer29 {
	/**
	 * 面试题29. 顺时针打印矩阵
	 * @param matrix
	 * @return
	 */
	public int[] spiralOrder(int[][] matrix) {
		if(matrix == null)
			return null;
		int t = 0,b=matrix.length,l=0,r=matrix[0].length;
		int[] res = new int[b*r];
		int k = 0;
		while(true) {
			for (int i = l; i < r; i++) {
				res[k++] = matrix[t][i];
			}
			if(++t>b-1) break;
			for (int i = t; i < b; i++) {
				res[k++] = matrix[i][r-1];
			}
			if(--r-1<l) break;
			for (int i = r-1; i >=l; i--) {
				res[k++] = matrix[b-1][i];
			}
			if(--b-1<t) break;
			for (int i = b-1; i >=t; i--) {
				res[k++] = matrix[i][l];
			}
			if(++l>r-1) break;
		}
		return res;
    }
}
