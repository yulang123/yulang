package com.day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Text1 {
	public static void main(String[] args) {
		Map<String,Integer > map=new HashMap<String,Integer>();
		map.put("����", 100);
		map.put("Ӣ��",90 );
		map.put("��ѧ",80 );
		map.put("����",60 );
		map.put("����",40 );
		
		System.out.println(map);
		//����ѭ�����
		Iterator<Entry<String, Integer>> a=map.entrySet().iterator();
		while(a.hasNext()){
			System.out.println(a.next());
		}
		//�½�һ������
		Map<String,Integer > b=new HashMap<String,Integer>();
		b.put("��׿", 88);
		b.put("java", 99);
		b.put("ios", 77);
		//��map�ļ��Ϸ��뵽b������
		b.putAll(map);
		System.out.println(b);
	
	}
}
