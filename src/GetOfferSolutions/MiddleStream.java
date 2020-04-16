package GetOfferSolutions;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MiddleStream {


		PriorityQueue<Integer> highQueue = new PriorityQueue<>(); // 小顶堆保存大数据部分
		   PriorityQueue<Integer> lowQueue = new PriorityQueue<>((Comparator<Integer>) (o1, o2) -> o2 - o1);// 大顶堆保存小数据部分
		 
		    public void Insert(Integer num) { // 保持两个堆平衡即size之差为1（默认lowQueue比highQueue >= 1）
		        lowQueue.offer(num);// 数据线往小堆扔
		        highQueue.offer(lowQueue.poll());// 保证存到大堆的永远是小队中的最大值（即保证数据被分为大、小两部分）
		        if (highQueue.size() > lowQueue.size()) {// 若此时大堆容量大于小堆则移出大堆中最小数据至小堆
		            lowQueue.offer(highQueue.poll());
		        }
		    }
		 
		    public Double GetMedian() {
		        return lowQueue.size() == highQueue.size() ? ((lowQueue.peek() + highQueue.peek()) * 0.5) : Double.valueOf(lowQueue.peek());
		    }
}
