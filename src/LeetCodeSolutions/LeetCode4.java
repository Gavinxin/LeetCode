package LeetCodeSolutions;

import java.util.PriorityQueue;

import org.junit.Test;

public class LeetCode4 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		//i numsi j nums2 m index
		int i = 0,j=0,m =0;
		int temp1 = 0,temp2 = 0;
		//mid num
		int n = (nums1.length+nums2.length)/2-1;
		while(i<nums1.length||j<nums2.length) {
			if(i>=nums1.length) {
				
				if(m==n) {
					temp1 = nums2[j];
				}
				if(m==n+1) {
					temp2= nums2[j];
					break;
				}
				m++;
				j++;
			}
			else if(j>=nums2.length) {
				
				if(m==n) {
					temp1 = nums1[i];
				}
				if(m==n+1) {
					temp2= nums1[i];
					break;
				}
				i++;
				m++;
			}
			else if(nums1[i]<=nums2[j]) {
				if(m==n) {
					temp1 = nums1[i];
				}
				if(m==n+1) {
					temp2= nums1[i];
					break;
				}
				i++;
				m++;
			}else {
				if(m==n) {
					temp1 = nums2[j];
				}
				if(m==n+1) {
					temp2= nums2[j];
					break;
				}
				j++;
				m++;
			}
			
				
		}
		return (nums1.length+nums2.length)%2==0?(temp1+temp2)*1.0/2:temp2;
    }
	public static void main(String[] args) {
		int[] n1 = new int[] {1,2};
		int[] n2 = new int[] {3,4};
		LeetCode4 l = new LeetCode4();
		System.out.println(l.findMedianSortedArrays(n1, n2));
	}
	
}
