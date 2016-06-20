package com.day15;

public class Text2 {
	public static void main(String[] args)throws Exception {
		String s="余浪abc";
		byte[] bytes1=s.getBytes();
		for (byte b : bytes1) {
			//字节转换16进制方式显示
			System.out.println(Integer.toHexString(b&0xff));
			
		}
		

		System.out.println();
		byte[] bytes2=s.getBytes("gbk");
		for (byte b : bytes2) {
			System.out.println(Integer.toHexString(b & 0xff));
			
		}
		System.out.println();
		byte[] bytes3=s.getBytes("utf-8");
		for (byte b : bytes3) {
			System.out.println(Integer.toHexString(b&0xff));
		}
		 
	}
	
}