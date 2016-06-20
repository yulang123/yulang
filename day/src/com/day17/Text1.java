package com.day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * java io 基于四个抽象类：输入输出流/读写
 * 
 * 流的分类：
 * 
 *遍历数组的时候用for 遍历集合框架时用foreach
 *
 * file：
 * String name="tom";
 * String[] arr=new String[2];
 * arr[0]=neame;
 * 
 * read()-->按照一个字节来读
 */
public class Text1 {
	public static void main(String[] args) {
		byte[] bytearr=new byte[50];//创建一个50个字节长度的数组
		//文件定位
		try{
			FileInputStream fis=new FileInputStream("D:\\fis.txt");
			FileOutputStream fos=new FileOutputStream("D:\\fos.txt");
			//进行io读写
			int s;
			try {
				while ((s=fis.read())!=-1) {
				fos.write(s);
					
				}
				fos.close();//关闭输出流
				fis.close();//关闭输入流
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		} 
		catch(Exception e2) {
			// TODO: handle exception
		}
	
	}
	

}
