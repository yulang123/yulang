package com.day15;

public class Text1 {
	public static int age;
	public static void main(String[] args) {
		Text1 out=new Text1();
		out.age=20;
		System.out.println("����"+out.age);
		Text1.In in=new Text1.In();
		in.test();
	}
	//�ڲ���
	static class In{
		public int id;
		//ѭ��ѪҺ
		public void test(){
			System.out.println("ѪҺѭ��");
			
		}
		
	}
}
