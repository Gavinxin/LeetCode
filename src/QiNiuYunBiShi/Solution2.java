package QiNiuYunBiShi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.valueOf(sc.nextLine());
		String[] input = new String[t];
		for (int i = 0; i < t; i++) {
			input[i] = sc.nextLine();			
		}
		
		for (int i = 0; i < input.length; i++) {
			StringBuilder s = new StringBuilder(input[i]);
			
			
			List<int[]> list = getDeleteIndex(s);
			while(list.size()>0) {
				 //System.out.println(list.size());
				for(int[] index:list) {
					//System.out.println(index[0]+" "+index[1]);
					s.deleteCharAt(index[1]);
					//System.out.println(s);
					s.deleteCharAt(index[0]);
					//System.out.println(s);
				}
					
				 list = getDeleteIndex(s);
				
			}
				
			if(list.size() == 0 && s.length() == 0) {
				System.out.println("YES");
			}
			if(list.size() == 0 && s.length() != 0) {
				System.out.println("NO");
			}
		}
	}

	private static List<int[]> getDeleteIndex(StringBuilder s) {
		List<int[]> list = new ArrayList<>();
		for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i)==s.charAt(i-1))
				{
					list.add(new int[] {i-1,i});
					break;
				}
		}
		return list;
	}
}
