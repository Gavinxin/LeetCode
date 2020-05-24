package com.practicetest.meituan;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String str =s.next();
			int k= s.nextInt();
			s.close();
			int sum = 0;
			for (int i = 0; i < args.length; i++) {
				for (int j = i; j < args.length; j++) {
					boolean b =isP(str,i,i);
					boolean c =isP(str,i,i+1);
					if(b||c)
						sum++;
				}
			}
			System.out.println(sum);
	}

	private static boolean isP(String str, int i, int j) {
		if(i==j)
			return true;
			while(i<j) {
				if(str.charAt(i)!=str.charAt(j))
					return false;
				i++;
				j--;
			}
		
		
			
		
		return true;
	}
}
