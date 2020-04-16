package LeetCodeSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LeetCode56 {
	/**
	 * 56. 合并区间
	 * 给出一个区间的集合，请合并所有重叠的区间
	 * @param intervals
	 * @return
	 */
	public int[][] merge(int[][] intervals) {
		if(intervals.length == 0)
			return new int[][]{};
		Arrays.sort(intervals,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0];
			}
		});
		ArrayList<int[]> list =new ArrayList<int[]>();
		int end = intervals[0][1];
		int start =intervals[0][0];
		for (int i = 1; i < intervals.length; i++) {
			if(intervals[i][0]<=end) {
				start = Math.min(start, intervals[i][0]);
				end = Math.max(end, intervals[i][1]);
			}
			else {
				list.add(new int[] {start,end});
				start =intervals[i][0];
				end = intervals[i][1];
				
			}
		}
		list.add(new int[] {start,end});
		return list.toArray(new int[list.size()][]);
    }
}
