package WZYH;

import java.util.Scanner;

public class Main1 {
	/**
	 * ��nλС����ȥС��������꣬С��׼����m�����С�������������ƽ���ָ�ÿ��С���ѣ�ÿ��С���ѵõ���ͬ�������������mδ���ܱ�n������С������ʹ���������ֲ��������Σ����ֲ�������ͬʱʹ�ã���

1�� ������һ��С���ѷ�������յ������С���ѻ��뿪С���ҡ�ÿ�������Ҫ����aԪ��

2�� ����һ�������ÿ�������ֵΪbԪ��

��С�����ٻ��Ѷ���Ԫ������ʹ������������Ա�ʣ�µ�С����ƽ�֡�
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = m%n!=0?n-m%n:0;
		if (a >= b)
			System.out.println(x*b);
			else System.out.println(x*a);
	
	}
}
