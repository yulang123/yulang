package com.day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Text1 {
	public static void main(String[] args) {
		Map<String,Integer > map=new HashMap<String,Integer>();
		map.put("语文", 100);
		map.put("英语",90 );
		map.put("数学",80 );
		map.put("政治",60 );
		map.put("地理",40 );
		
		System.out.println(map);
		//遍历循环输出
		Iterator<Entry<String, Integer>> a=map.entrySet().iterator();
		while(a.hasNext()){
			System.out.println(a.next());
		}
		//新建一个集合
		Map<String,Integer > b=new HashMap<String,Integer>();
		b.put("安卓", 88);
		b.put("java", 99);
		b.put("ios", 77);
		//把map的集合放入到b集合中
		b.putAll(map);
		System.out.println(b);
	
	}
}
