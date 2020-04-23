package HWInterview;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution1 {
    public class num{
    	int id;
    	int cnt;
		public num(int id, int cnt) {
			super();
			this.id = id;
			this.cnt = cnt;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getCnt() {
			return cnt;
		}
		public void setCnt(int cnt) {
			this.cnt = cnt;
		}
		
    	
    }
	public int[] getTopK(int[] nums,int k) {
		int[] res  = new int[k];
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		for (int i = 0; i < nums.length; i++) {
			int cnt = map.getOrDefault(nums[i], 0);
			map.put(nums[i], cnt+1);
		}
		PriorityQueue<num> queue = new PriorityQueue<>((n1,n2)->n1.getCnt()-n2.getCnt());
		for (Integer key:map.keySet()) {
			queue.add(new num(key,map.get(key)));
			if(queue.size()>k)
				queue.poll();
		}
		int i = 0;
		while(queue.size()>0)
			{
				res[i] = queue.poll().getId();
				i++;
			}
		
		return res;
	}
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,2,3,4,5}; 
		Solution1 s1 = new Solution1();
		int[] res = s1.getTopK(nums, 3);
		System.out.println(Arrays.toString(res));
	}
}
