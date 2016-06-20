package com.day16;

import java.io.File;
import java.io.IOException;
/*
 * 如果在File中指定二级文件的时候File不能创建该文件
 */
public class Text3 {
	public static void main(String[] args) throws IOException {
		boolean f=new File("D:\\javaf").mkdirs();
		File f1=new File("D:\\javaf\\test.txt");
		if (f1.exists()) {
			f1.delete();
			
		}else{
			//创建目录
			//f.mkdirs();
			/*
			 * 1:mkdir()--创建一级文件夹
			 * 2：mkdirs()--创建二级文件夹
			 */
			
			f1.createNewFile();//异常处理
			System.out.println("是否可写"+f1.canWrite());
		}
		
	}

}
