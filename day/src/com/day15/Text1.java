package com.day15;

public class Text1 {
	public static int age;
	public static void main(String[] args) {
		Text1 out=new Text1();
		out.age=20;
		System.out.println("年龄"+out.age);
		Text1.In in=new Text1.In();
		in.test();
	}
	//内部类
	static class In{
		public int id;
		//循环血液
		public void test(){
			System.out.println("血液循环");
			
		}
		
	}
}
