package LeetCodeSolutions;

public class LeetCode461 {
	/**
	 * 461. ��������
	 * @param x
	 * @param y
	 * @return
	 */
	public int hammingDistance(int x, int y) {
		//����� ��ͳ��1�ĸ���
		return Integer.bitCount(x^y);
    }
}
