package LeetCodeSolution;

public class LeetCode_42 {
	 public int trap(int[] height) {
		 int sum = 0;
		 int size = height.length;
		    for (int i = 1; i < size - 1; i++) {
		        int max_left = 0, max_right = 0;
		        for (int j = i; j >= 0; j--) { //Search the left part for max bar size
		            max_left = Math.max(max_left, height[j]);
		        }
		        for (int j = i; j < size; j++) { //Search the right part for max bar size
		            max_right = Math.max(max_right, height[j]);
		        }
		        sum += Math.min(max_left, max_right) - height[i];
		    }
		    return sum;

		
	 }
	 public int trap1(int[] height) {
//		 找到数组中从下标 i 到最左端�?高的条形块高�? \text{left\_max}left_max�?
//		 找到数组中从下标 i 到最右端�?高的条形块高�? \text{right\_max}right_max�?
//		 扫描数组 \text{height}height 并更新答案：
//		 累加 \min(\text{max\_left}[i],\text{max\_right}[i]) - \text{height}[i]min(max_left[i],max_right[i])−height[i] �? ansans �?
		 if(height.length == 0)
	          return 0;
		 int sum = 0;
		 int length = height.length;
		 int[] max_left = new int[length];
		 int[] max_right = new int[length];
		 max_left[0] = height[0];
		 for (int i = 1; i < length; i++) {
			max_left[i] = Math.max(max_left[i-1], height[i]);
		 }
		 max_right[length-1] = height[length-1];
		 for (int i = length-2; i >= 0; i--) {
			max_right[i] = Math.max(max_right[i+1], height[i]);
		 }
		for (int i = 1; i < length-1; i++) {
			sum += Math.min(max_left[i], max_right[i]) - height[i];
		}
		return  sum;
	 }
}
