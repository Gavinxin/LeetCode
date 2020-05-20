package com.practicetest.wzyh;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
	static int max = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();	
		}
		List<String> list =new ArrayList<>();
		for (int i = 0; i < b.length; i++) {
			list.add(i+"");
			maxMoney(a,b,list,a[i],b[i]);
			list.remove(i+"");
		}
		
		System.out.println(max);
	}
	private static void maxMoney(int[] a, int[] b, List<String> list, int sum, int k) {
		if(k == 0)
			max = Math.max(sum, max);
		if(k>0) {
			for (int i = 0; i < k; i++) {
				for (int j = 0; j < b.length; j++) {
					if(!list.contains(j+"")) {
						list.add(j+"");
						maxMoney(a,b,list,sum+a[j],k+b[j]-1);
						list.remove(j+"");
					}
						
				}
			}
		}
		
	}

	
}
