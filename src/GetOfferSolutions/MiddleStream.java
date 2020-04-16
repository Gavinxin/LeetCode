package GetOfferSolutions;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MiddleStream {


		PriorityQueue<Integer> highQueue = new PriorityQueue<>(); // С���ѱ�������ݲ���
		   PriorityQueue<Integer> lowQueue = new PriorityQueue<>((Comparator<Integer>) (o1, o2) -> o2 - o1);// �󶥶ѱ���С���ݲ���
		 
		    public void Insert(Integer num) { // ����������ƽ�⼴size֮��Ϊ1��Ĭ��lowQueue��highQueue >= 1��
		        lowQueue.offer(num);// ��������С����
		        highQueue.offer(lowQueue.poll());// ��֤�浽��ѵ���Զ��С���е����ֵ������֤���ݱ���Ϊ��С�����֣�
		        if (highQueue.size() > lowQueue.size()) {// ����ʱ�����������С�����Ƴ��������С������С��
		            lowQueue.offer(highQueue.poll());
		        }
		    }
		 
		    public Double GetMedian() {
		        return lowQueue.size() == highQueue.size() ? ((lowQueue.peek() + highQueue.peek()) * 0.5) : Double.valueOf(lowQueue.peek());
		    }
}
