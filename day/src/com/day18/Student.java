package com.day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Student {
	public static void main(String[] args) throws IOException {
		//�����ַ�������
	
	String content[]={"�þò���","�������","����ϵ"};
    File file=new File("D:\\word.text");//�����ļ�����
    FileWriter fw=new FileWriter(file);//����һ��FileWriter��Ķ���
  
    BufferedWriter bufw=new BufferedWriter(fw);//����BufferedWriter�����
     for (int i = 0; i < content.length; i++) {//ѭ����������
		bufw.write(content[i]);//�������е�Ԫ��д�뵽�����ļ���
		bufw.newLine();//����
	}
     bufw.close();//�ر���
     fw.close();
     FileReader fr=new FileReader(file);//����FileReader�����
     BufferedReader bufr=new BufferedReader(fr);
     String s=null;
     int i=0;
     
     
    		 
     
     
    		
}
}