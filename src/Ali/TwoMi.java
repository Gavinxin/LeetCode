package Ali;

import java.util.HashMap;
import java.util.Map;

public class TwoMi {
	public static void main(String[] args) {
		TwoMi a =new TwoMi();
		System.out.println(a.solution(3, new int[]{1,0,2}));;
	}
	public int solution(int n,int[] nums) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int cnt =0;
	    for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], 1);
		}
	    for (int i = 0; i < nums.length; i++) {
	    	int j = 2;
	    	for (; j < 2000; j*=2) {
				if(map.containsKey(j-nums[i])&&j-nums[i]!=j)
					break;
			}
	    	if(j>200)
	    		cnt++;
		}
	    return cnt;
    }
}
