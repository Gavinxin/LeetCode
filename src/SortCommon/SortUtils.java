package SortCommon;



public class SortUtils {
	public static void main(String[] args) {
		int[] nums = {5,1,1,2,0,0};
		int[] i= quichsort(nums, 0, nums.length-1);
		for (int j : i) {
			System.out.println(j);
		}
 	}

	public static int[] quichsort(int[] nums, int low, int high) {
		if(low<high) {
			int index = partition(nums,low,high);
			quichsort(nums, low, index-1);
			quichsort(nums, index+1, high);
		}
		
		return nums;
	}

	private static int partition(int[] nums, int low, int high) {
		int base = nums[low];
		
		while(low<high) {
			while(low<high&&nums[high]>=base)
				high--;
			nums[low] = nums[high];
			while(low<high&&nums[low]<=base)
				low++;
			nums[high] = nums[low];
		}
		nums[low] = base;
		return low;
	}
}
