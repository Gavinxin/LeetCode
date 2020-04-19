package LeetCodeSolution;

public class LeetCode466 {
	/**
	 * 466. ͳ���ظ�����
	 * @param s1
	 * @param n1
	 * @param s2
	 * @param n2
	 * @return
	 */
	 public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
	        int len1 = s1.length();
	        int len2 = s2.length();
	        // ����
	        if (len1 == 0 || len2 == 0 || n1 == 0 || n2 == 0) {
	            return 0;
	        }
	        char[] chars1 = s1.toCharArray();
	        char[] chars2 = s2.toCharArray();

	        // ��¼��һ��Ҫƥ���s2���ַ�������
	        int index = 0;
	        // ��¼ƥ�����s2����
	        int count = 0;
	        // ��¼�ڱ���ÿ��s1ʱƥ�����s2�ĸ����������ǰ�����ǰ��һ��s1ѭ���ڵĲ���
	        int[] countRecorder = new int[len2 + 1];
	        // ��¼��ÿ��s1����Ҫƥ���s2���ַ�������
	        int[] indexRecorder = new int[len2 + 1];

	        for (int i = 0; i < n1; ++i) {
	            // ����s1
	            for (int j = 0; j < len1; ++j) {
	                // ƥ��s2�ַ���ƥ��ɹ���s2����+1
	                if (chars1[j] == chars2[index]) {
	                    ++index;
	                }
	                // ƥ����һ��s2��������+1������s2����
	                if (index == chars2.length) {
	                    index = 0;
	                    ++count;
	                }
	            }
	            // ��¼������i��s1��s2���ֵĴ���
	            countRecorder[i] = count;
	            // ��¼�������i��s1��s2��һ��Ҫ��ƥ�䵽���ַ��±�
	            indexRecorder[i] = index;
	            // ��֦
	            // �鿴��������֮ǰ�Ƿ��ѳ��֣����ּ���ʾ�Ѿ�����ѭ���ڣ�����ֱ�ӽ��м���
	            // ��һ�γ��ָ��������ڵ�j��s1�У�ͬʱ����˵����һ��ѭ���ڵĳ����Ǵӵ�j+1��s1��ʼ�ģ�
	            for (int j = 0; j < i && indexRecorder[j] == index; ++j) {
	                // preCount: ��¼ѭ���ڳ���֮ǰ��s2���ֵĸ���
	                int preCount = countRecorder[j];
	                // patternCount: ��¼����ѭ���ڹ��ɵ��ַ����г���s2�ĸ���
	                //      (n1 - 1 - j) / (i - j): ѭ���ڸ���
	                //      countRecorder[i] - countRecorder[j]: һ��ѭ�����а�����s2����
	                int patternCount = ((n1 - 1 - j) / (i - j)) * (countRecorder[i] - countRecorder[j]);
	                // remainCount: ��¼ʣ��δ��������ѭ���ڵĲ��ֳ��ֵ�s2�ĸ���
	                //      ͨ��ȡģ������ѭ���ڼ�¼�в��ң�����ȥѭ����֮ǰ���ֵĴ���
	                int remainCount = countRecorder[j + (n1 - 1 - j) % (i - j)] - countRecorder[j];
	                // ������ӣ���Ϊ���ֵ�s2���ܴ���
	                return (preCount + patternCount + remainCount) / n2;
	            }
	        }
	        // û��ѭ���ڵĳ��֣��൱��ֱ��ʹ�ñ�����
	        return countRecorder[n1 - 1] / n2;
	    }
}
