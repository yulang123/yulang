package com.day16;

import java.io.File;
import java.io.FilenameFilter;
/**
 * 过滤一个文件夹里面的文件
 * 比如：返回。.doc
 * @author yulang
 *
 */
public class Test2 {
	public static void main(String[] args) {
		File f=new File("D:\\预科新学员教学安排");
		File fileList[]=f.listFiles();
		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].getName().endsWith(".txt")) {
				System.out.println(fileList[i].getName());
			}
		
		}
//		过滤f.list-->该文件下面所有的文件名组成的String数组
//		String[] fileString=f.list(new MyFilenameFi	if (fileList[i].getName().endsWith(".txt)) {lter());
//		for (int i = 0; i < fileString.length; i++) {
//			System.out.println(fileString[i]);
//		}
	}

}
/*
 * 
 */
class MyFilenameFilter implements FilenameFilter{
/**
 * String name:文件的名称
 * File file：文件
 */
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(".txt");
	}
	
}