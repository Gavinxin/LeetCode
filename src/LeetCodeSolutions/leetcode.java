package LeetCodeSolutions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class leetcode {
	public static void main(String[] args) {
//		int[] num = { 10, 2, 1, 4, 5 };
//		// System.err.println(largestNumber(num));
//		int[] a = findminK(num, 2);
//		for (int i : a) {
//			System.out.println(i);
//		}
		System.out.println(cutRopeDP(9));

	}

	public static int countCharacters(String[] words, String chars) {
		int sum_count = 0;
		int[] a = new int[26];
		int[] b;
		for (int i = 0; i < chars.length(); i++) {
			int k = chars.charAt(i) - 'a';
			a[k]++;
		}
		for (String str : words) {
			b = new int[26];
			for (int i = 0; i < str.length(); i++) {
				int k = str.charAt(i) - 'a';
				b[k]++;
			}
			int j;
			for (j = 0; j < 26; j++)
				if (a[j] < b[j])
					break;
			if (j >= 26) {
				sum_count += str.length();
			}
		}
		return sum_count;
	}

	// leetcode 836
	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		if (rec1[0] >= rec2[2] || rec1[2] <= rec2[1] || rec1[1] >= rec2[3] || rec1[3] <= rec2[1])
			return false;
		return true;
	}

	// leetcode 836
	public int[] nextGreaterElements(int[] nums) {
		int[] results = new int[10000];
		for (int i = 0; i < nums.length; i++) {

		}
		return results;
	}

	// leecode 179
	public static String largestNumber(int[] nums) {
		Arrays.sort(nums);
		StringBuilder str = new StringBuilder();
		for (int i = nums.length - 1; i > 0; i--) {
			str.append(nums[i]);
		}
		return str.toString();
	}

	private static int[] findminK(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		for (int i = 0; i < nums.length; i++) {
			if (i < k) {
				pq.offer(nums[i]);
				// System.out.println(pq.toString());
			}

			else {
				int temp = pq.peek();
				if (nums[i] < temp) {
					pq.poll();
					pq.offer(nums[i]);
				}

			}
		}
		System.out.println(pq.toString());
		int[] results = new int[k];
		Iterator<Integer> a = pq.iterator();
		int i = 0;
		while (i < k) {
			results[i] = a.next();
		}

		return results;
	}

	public boolean Find(int target, int[][] array) {
		int x = array.length;
		int y = array[0].length;
		if (x == 0 || y == 0)
			return false;
		for (int i = 0; i < x; i++) {
			if (array[i][y - 1] == target)
				return true;
			else if (array[i][y - 1] > target) {
				for (int j = 0; j < y; j++) {
					if (target == array[i][j])
						return true;
				}
			}

		}
		return false;

	}

	public String replaceSpace(StringBuffer str) {

		return str.toString().replace(" ", "%20");
	}

	public int cutRopeDG(int target) {

		if (target < 2)
			return 0;
		if (target == 2)
			return 1;
		if (target == 3)
			return 2;
		return cutRopeT(target);
	}

	private int cutRopeT(int target) {
		int max = 0;
		if (target < 4)
			return target;
		for (int i = 0; i < target / 2 + 1; i++)
			max = Math.max(cutRopeT(target - i) * cutRopeT(i), max);
		return max;
	}

	public static int cutRopeDP(int target) {
		int[] max = new int[target+1];
		if(target <= 4)
			return target;
		max[0] =1;
		max[1] = 1;
		max[2] =2;
		max[3] =3;
		max[4] =4;
		for (int i = 5; i <= target; i++) {
			max[i] = 0;
			for (int j = 2; j < i/2+1; j++) {
				max[i] = Math.max(max[i], max[i-j]*max[j]);
				
			}
		}
		return max[target];
	}
}
