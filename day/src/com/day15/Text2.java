package com.day15;

public class Text2 {
	public static void main(String[] args)throws Exception {
		String s="����abc";
		byte[] bytes1=s.getBytes();
		for (byte b : bytes1) {
			//�ֽ�ת��16���Ʒ�ʽ��ʾ
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