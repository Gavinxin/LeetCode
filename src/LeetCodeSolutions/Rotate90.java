package LeetCodeSolutions;

import java.util.Arrays;

public class Rotate90 {
	public static void main(String[] args) {
		int[][] ma = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		Rotate90 r =new Rotate90();
		r.rotate(ma);
		System.out.println(Arrays.toString(ma[0]));;
		System.out.println(Arrays.toString(ma[1]));;
		System.out.println(Arrays.toString(ma[2]));;
	}
	public void rotate(int[][] matrix) {
		int n = matrix[0].length;
        // C++ 这里的 = 拷贝是值拷贝，会得到一个新的数组
        int[][]  matrix_new = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
            	
            	matrix_new[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
            	
            	matrix[j][n - i - 1] = matrix_new[i][j];
            }
        }
       
    }
}
