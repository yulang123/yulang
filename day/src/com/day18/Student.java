package com.day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Student {
	public static void main(String[] args) throws IOException {
		//定义字符串数组
	
	String content[]={"好久不见","最近好吗","常联系"};
    File file=new File("D:\\word.text");//创建文件对象
    FileWriter fw=new FileWriter(file);//创建一个FileWriter类的对象
  
    BufferedWriter bufw=new BufferedWriter(fw);//创建BufferedWriter类对象
     for (int i = 0; i < content.length; i++) {//循环遍历数组
		bufw.write(content[i]);//将数组中的元素写入到磁盘文件中
		bufw.newLine();//分行
	}
     bufw.close();//关闭流
     fw.close();
     FileReader fr=new FileReader(file);//创建FileReader类对象
     BufferedReader bufr=new BufferedReader(fr);
     String s=null;
     int i=0;
     
     
    		 
     
     
    		
}
}