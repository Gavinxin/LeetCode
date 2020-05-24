package com.practicetest.yuewen20200519;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution4 {
	/**
     * 计算token
     * @param querys string字符串ArrayList 输入参数，每个键值对用=分割
     * @return string字符串
	 * @throws UnsupportedEncodingException 
     */
    public String createToken (ArrayList<String> querys) throws UnsupportedEncodingException {
    	Map<String,String> encodes = new HashMap<>();
    	for (int i = 0; i < querys.size(); i++) {
    		String[] strss = querys.get(i).split("=");
    		encodes.put(URLEncoder.encode(strss[0], "UTF-8"), URLEncoder.encode(strss[1], "UTF-8"));
    		System.out.println(encodes.get(i));
		}
    	//Collections.sort((List<T>) encodes);
    	String res= encodes.get(encodes.size()-1).split("%3D%")[1];
    	for (int i = encodes.size()-2; i >=0; i--) {
			
		}
    	return null;
    }
    public static void main(String[] args) throws Exception {
    	Solution4 s = new Solution4();
    	ArrayList<String> querys = new ArrayList<>();
    	querys.add("query=中文");
    	querys.add("version=1.0.0");
    	System.out.println(s.createToken(querys));
	}
}
