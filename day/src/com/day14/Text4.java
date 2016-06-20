package com.day14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/**
 * 集合的去重
 * 
 * @author yulang
 */
public class Text4 {
public static void main(String[] args) {
	
	List<Integer>list=new ArrayList<Integer>();
	list.add(1);
	list.add(3);
	list.add(5);
	list.add(3);
	list.add(5);
	list.add(2);
	//去重
	List<Integer> numlist=new ArrayList<Integer>(new HashSet<Integer>(list));
	for (Integer integer : numlist) {
		System.out.println( integer);
	}
}
}
