package com.practicetest.yuewen20200519;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Solution2 {
	static SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String start = sc.nextLine();
		String end = sc.nextLine();
		System.out.println((sdf.parse(end).getTime()-sdf.parse(start).getTime())/60000);
	}
}
