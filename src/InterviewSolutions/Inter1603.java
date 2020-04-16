package InterviewSolutions;

import java.util.Arrays;

public class Inter1603 {
	/**
	 * 
	 * @param start1
	 * @param end1
	 * @param start2
	 * @param end2
	 * @return
	 */
	public double[] intersection(int[] start1, int[] end1, int[] start2, int[] end2) {
	    int x1 = start1[0], y1 = start1[1];
	    int x2 = end1[0], y2 = end1[1];
	    int x3 = start2[0], y3 = start2[1];
	    int x4 = end2[0], y4 = end2[1];

	    double[] ans = new double[2];
	    Arrays.fill(ans, Double.MAX_VALUE);
	    // �ж���ֱ���Ƿ�ƽ��
	    if ((y4-y3)*(x2-x1) == (y2-y1)*(x4-x3)) {
	      // �ж���ֱ���Ƿ��ص�
	      if ((y2-y1)*(x3-x1) == (y3-y1)*(x2-x1)) {
	        // �ж� (x3, y3) �Ƿ��ڡ��߶Ρ�(x1, y1)~(x2, y2) ��
	        if (isInside(x1, y1, x2, y2, x3, y3)) {
	          updateRes(ans, x3, y3);
	        }
	        // �ж� (x4, y4) �Ƿ��ڡ��߶Ρ�(x1, y1)~(x2, y2) ��
	        if (isInside(x1, y1, x2, y2, x4, y4)) {
	          updateRes(ans, (double)x4, (double)y4);
	        }
	        // �ж� (x1, y1) �Ƿ��ڡ��߶Ρ�(x3, y3)~(x4, y4) ��
	        if (isInside(x3, y3, x4, y4, x1, y1)) {
	          updateRes(ans, (double)x1, (double)y1);
	        }
	        // �ж� (x2, y2) �Ƿ��ڡ��߶Ρ�(x3, y3)~(x4, y4) ��
	        if (isInside(x3, y3, x4, y4, x2, y2)) {
	          updateRes(ans, (double)x2, (double)y2);
	        }
	      }
	    } else {
	      // �������̵õ� t1 �� t2 ��ֵ
	      double t1 = (double)(x3 * (y4 - y3) + y1 * (x4 - x3) - y3 * (x4 - x3) - x1 * (y4 - y3)) / ((x2 - x1) * (y4 - y3) - (x4 - x3) * (y2 - y1));
	      double t2 = (double)(x1 * (y2 - y1) + y3 * (x2 - x1) - y1 * (x2 - x1) - x3 * (y2 - y1)) / ((x4 - x3) * (y2 - y1) - (x2 - x1) * (y4 - y3));
	      // �ж� t1 �� t2 �Ƿ���� [0, 1] ֮��
	      if (t1 >= 0.0 && t1 <= 1.0 && t2 >= 0.0 && t2 <= 1.0) {
	        ans[0] = x1 + t1 * (x2 - x1);
	        ans[1] = y1 + t1 * (y2 - y1);
	      }
	    }
	    if (ans[0] == Double.MAX_VALUE) {
	      return new double[0];
	    }
	    return ans;
	  }

	  // �ж� (x, y) �Ƿ��ڡ��߶Ρ�(x1, y1)~(x2, y2) ��
	  // �����ǰ���� (x, y) һ���ڡ�ֱ�ߡ�(x1, y1)~(x2, y2) ��
	  private boolean isInside(int x1, int y1, int x2, int y2, int x, int y) {
	    // ���� x ��ƽ�У�ֻ��Ҫ�ж� x �Ĳ���
	    // ���� y ��ƽ�У�ֻ��Ҫ�ж� y �Ĳ���
	    // ��Ϊ��ͨ�߶Σ���Ҫ�ж�
	    return (x1 == x2 || (Math.min(x1, x2) <= x && x <= Math.max(x1, x2)))
	            && (y1 == y2 || (Math.min(y1, y2) <= y && y <= Math.max(y1, y2)));
	  }

	  private void updateRes(double[] ans, double x, double y) {
	    if (x < ans[0] || (x == ans[0] && y < ans[1])) {
	      ans[0] = x;
	      ans[1] = y;
	    }
	  }
}
