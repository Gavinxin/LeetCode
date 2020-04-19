package JD20200418;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] input = new int[n][2];
		for (int i = 0; i < n; i++) {
			input[i][0] = in.nextInt();
			input[i][1] = in.nextInt();
		}
		Arrays.sort(input,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0]!=o2[0]?o1[0]-o2[0]:o1[1]-o2[1];
			}
		});
		int ticketnum =n;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if(input[i][0]>=input[j][1])
					{
					ticketnum--;
					break;
					}
			}
		}
		System.out.println(ticketnum+1);
		
		
	}
}
