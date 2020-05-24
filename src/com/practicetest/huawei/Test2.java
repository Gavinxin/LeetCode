package com.practicetest.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strs[] = str.split(" ");
		String matchkey = strs[0];
		String[] matchStr = strs[1].split("],");
		StringBuilder sb =new StringBuilder();
		if(str.length()>0 && str.length()<=1024 && !str.contains(" "))
		for (int i = 0; i < matchStr.length; i++) {
			String str0 = matchStr[i];
			int index = str0.indexOf('[');
			if(str0.subSequence(0, index).equals(matchkey)) {
				String str1;
				if( i < matchStr.length-1)
					str1 = str0.substring(index+1);
				else str1 = str0.substring(index+1,str0.length()-1);
				//System.out.println(str1);
				if(str1.contains("addr=")&&str1.contains("mask=")&&str1.contains("val=")) {
					String str2[] = str1.split(",");
					String[][] str3 = new String[str2.length][];
					for (int j = 0; j < str2.length; j++) {
						//System.out.println(str2[j]);
						 str3[j] = str2[j].split("=");
//						 if( j==str2.length-1)
//							 str3[0][1] = str3[0][1].substring(0,str3[0][1].length()-2);
						 //System.out.println(str3[j][0]);
					}
					int x =-1,y=-1,z=-1;
					for (int j = 0; j < str3.length; j++) {
						if(str3[j][0].equals("addr"))
							x=j;
						if(str3[j][0].equals("mask"))
							y =j;
						if(str3[j][0].equals("val"))
							z=j;
					}
					//System.out.println(x+" "+y+" "+z);
					if(is16Dig(str3[x][1])&&is16Dig(str3[y][1])&&is16Dig(str3[z][1])) {
						
						sb.append(str3[x][1]+" ");
						sb.append(str3[y][1]+" ");
						sb.append(str3[z][1]);
						sb.append("\r\n");
					}
					
				}
			}
		}
		if(sb.length() == 0)
			System.out.println("FAIL");
		else
			System.out.println(sb.toString());
	}
	public static boolean is16Dig(String s) {
		String st = s.toLowerCase();
		if(!st.subSequence(0, 2).equals("0x")) return false;
		String str = st.substring(2);
		for (int i = 0; i <str.length(); i++) {
			if(str.charAt(i)>='0'&&str.charAt(i)<='9' || str.charAt(i)>='a'&&str.charAt(i)<='f')
				continue;
			else
				return false;
		}
		return true;		
	}

}
