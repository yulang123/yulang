package com.day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
//map�е�key����Ϊ��
public class Text {
	public static void main(String[] args) {
		
	
  Map<String, Integer> map=new HashMap<String,Integer>();
  map.put("�Ϻ�",20);
  map.put("����", 30);
  System.out.println("�鿴map�ж�������"+map.size());
 // map.remove("�Ϻ�");
  set<Entry<String, Integer>>
  Iterator<Entry<String, Integer>> a=map.entrySet().iterator();
  while (a.hasNext()) {
	System.out.println(a.next());
	
	
}
//  System.out.println(map.get("�Ϻ�"));
//  map.clear();
//  if (map.isEmpty()) {
//	System.out.println(map);
//}
 
   
	}
    
	
}
