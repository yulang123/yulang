package com.day16;

import java.io.File;
import java.io.IOException;
/*
 * �����File��ָ�������ļ���ʱ��File���ܴ������ļ�
 */
public class Text3 {
	public static void main(String[] args) throws IOException {
		boolean f=new File("D:\\javaf").mkdirs();
		File f1=new File("D:\\javaf\\test.txt");
		if (f1.exists()) {
			f1.delete();
			
		}else{
			//����Ŀ¼
			//f.mkdirs();
			/*
			 * 1:mkdir()--����һ���ļ���
			 * 2��mkdirs()--���������ļ���
			 */
			
			f1.createNewFile();//�쳣����
			System.out.println("�Ƿ��д"+f1.canWrite());
		}
		
	}

}
