package SortCommon;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int[] arr = {9,3,4,6,8,7,1,2};
		HeapSort hs = new HeapSort();
		hs.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public void sort(int[] arr) {
		int length = arr.length;
		for (int i = (length-1)/2; i >= 0; i--) {
			adjustHeap(arr, i, length);
			
		}
		
		for (int i = length - 1; i >=1; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			//System.out.println(Arrays.toString(arr));
			adjustHeap(arr, 0, i);
		}

	}

	/**
	 * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
	 * 
	 * @param arr
	 * @param i
	 * @param length
	 */
	public void adjustHeap(int[] arr, int i, int j) {
		
		int temp = arr[i];
		for (int k = 2*i+1; k < j; k = k*2+1) {
			if (k + 1 < j && arr[k] < arr[k + 1])
				k++;
			if (arr[k] > temp) {
				arr[i] = arr[k];
				i = k;
			}
			else break;
		}
		arr[i] = temp;
	}



}
