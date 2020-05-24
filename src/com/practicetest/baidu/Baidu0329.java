package com.practicetest.baidu;
import java.util.Scanner;

public class Baidu0329 {
	/**
	 * 
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 0;
		int max=0;
        if (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
             n= in.nextInt();    
        }
        for (int i = 1; i <= n; i++) {
			for (int j = i+1; j <= n; j++) {
				if(j%i==0)
					continue;
				int k =lcm(i,j)-gcd(i,j);
				max = Math.max(max, lcm(i,j)-gcd(i,j));
			}
		}
        System.out.println(max);
	}
	
	public static int lcm(int a,int b) {
		int gcd = gcd(a,b);
		
		return b*a/gcd;
	}
	public static int gcd(int a,int b) {
		if(a==b)
			return a;
		if( a <b ) {
			int temp = a;
			a =b ;
			b=temp;
		}
		if(a%b == 0)
			return b;
		while(a>0 && b>0) {
			int temp = a-b;
			if(b%temp == 0 && a% temp ==0)
				return temp;
			else{
				a=b;
				b = temp;
			}
		}
		return 1;
	}

}
