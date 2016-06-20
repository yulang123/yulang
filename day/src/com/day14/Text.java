package com.day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
//map中的key可以为空
public class Text {
	public static void main(String[] args) {
		
	
  Map<String, Integer> map=new HashMap<String,Integer>();
  map.put("严鸿",20);
  map.put("阳阳", 30);
  System.out.println("查看map有多少数据"+map.size());
 // map.remove("严鸿");
  set<Entry<String, Integer>>
  Iterator<Entry<String, Integer>> a=map.entrySet().iterator();
  while (a.hasNext()) {
	System.out.println(a.next());
	
	
}
//  System.out.println(map.get("严鸿"));
//  map.clear();
//  if (map.isEmpty()) {
//	System.out.println(map);
//}
 
   
	}
    
	
}
