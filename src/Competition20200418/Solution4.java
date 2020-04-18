package Competition20200418;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution4 {
	/**
	 * 4. ��С��Ծ����
	 * Ϊ�˸�ˢ���ͬѧһЩ�����������Ŷ�������һ��������Ϸ������Ϸ���� N �����ⵯ���ų�һ�ţ����Ϊ 0 �� N-1����ʼ��һ��С���ڱ�� 0 �ĵ��ɴ�����С���ڱ��Ϊ i �ĵ��ɴ���ͨ���������ɣ�����ѡ���С�����ҵ��� jump[i] �ľ��룬���������䵽������൯�ɵ�λ�á�Ҳ����˵���ڱ��Ϊ i ���ɴ��������ɣ�С����Ե��� 0 �� i-1 �����ⵯ�ɻ��� i+jump[i] �ĵ��ɣ��� i+jump[i]>=N �����ʾС�򵯳��˻�������С��λ�ڱ�� 0 ���ĵ���ʱ���������󵯡�
Ϊ�˻�ý���������Ҫ��С�򵯳������������������Ҫ�������ٴε��ɣ����Խ�С��ӱ�� 0 ���ɵ�������������������Խ����� N-1 �ĵ��ɡ�
	 * @param jump
	 * @return
	 */
	 public int minJump(int[] jump) {
		 //��ǰ�ڵ��ܹ��ﵽ����Զλ��
		 if(jump.length==1 &&jump[0]>=1) return 1;
		 if(jump.length<=jump[0]) return 1;
		 int index = 0;
		 List<Integer> list = new ArrayList<Integer>();
		 for (int i = 0; i < jump.length; i++) {
				if(i+jump[i]>=jump.length)
					list.add(i);		
		}
		 //�ܹ�����iλ�õ���С����
		int[] step =new int[jump.length];
		Arrays.fill(step, jump.length+1);
		step[0] = 0;
		for (int i = 1; i < jump.length; i++) {
			for (int j = 0; j < step.length; j++) {
				if(i<j+jump[j])
					step[i] = Math.min(step[i], step[j]+2);
				if(i == j+jump[j])
					step[i] = Math.min(step[i], step[j]+1);
			}
		}
		int min = jump.length+1;
		list.stream().forEach(System.out::println);
		System.out.println(Arrays.toString(step));
		for (int i = 0; i < step.length; i++) {
			if(list.contains(i))
				min = Math.min(step[i], min);
		}
		return min+1;
	 }
	 public static void main(String[] args) {
		int[] arr = new int[]{2, 5,1};
		Solution4 s4 = new Solution4();
		System.out.println(s4.minJump(arr));
	}
}
