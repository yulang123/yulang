package com.day16;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * ������������ڼ��Ƿ���Ҫ���ݣ�����������Щ���棿
 * 1.Scanner:��������
 * 2.������������ݡ������ļ���
 * 3.�����������ݡ��û���¼ϵͳ��
 * IO���ã��������û��������ݻ��ߴ�Ӳ�̶�ȡ����
 * Mysql:�����û����ݣ����ߴ�Ӳ�̶�ȡ����---��������һ�����ݿ����ϵͳ�����Ը��ӷ���Ĺ�������
 * -------
 * Java IO��
 * 1.�����ķ����������������������
 * 2.���������ݴ���λ�������ֽ������ַ���
 * --------
 * ʵ��Ӧ���п��԰������߽��������
 * �����ֽ���    �����ַ���
 * ����                         ��
 * io�����������ļ̳���ϵ��
 * 1.���ֽ�Ϊ��λ����xxxxStream
 * 2.  �ַ�Ϊ             xxxxReader
 * ����ֽڣ�InputStream outputStream �ֽ��������
 * ����ַ���Reader���� ���룩 Writer��д������� �ַ���������� java��涨%@&Ϊ�ַ�
 * -------------------
 * java����õ���unicode���뼯��utf8������unicode�����ԣ�������gbk
 * utf8��unicode�ڱ���洢����Щ��ͬ������3���ֽڣ�Ӣ1��
 * 
 * 
 * @author yulang
 *
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
	//windowsϵͳ·���ָ���\linuxϵͳ�ָ���
	 File file=new File("D:\\fileTest.txt");
	if (file.exists()){
		 file.delete();//ɾ���ļ�
	 }else {
		 file.createNewFile();
		System.out.println("�����ļ�");
		
	}
	System.out.println("�ļ���С��"+(file.length()) +"�ֽ�");
	 File[] files=file.listFiles();
	 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//��ʽ������
	 for (int i = 0; i < files.length; i++) {
		 System.out.println(files[i].getName());
		 System.out.println("���һ���޸ĵ�ʱ��"+sdf.format(files[i].lastModified()));
		
		 if (files[i].isDirectory()) {
			 File[] erjiFile=files[i].listFiles();//�����ļ���
			 for (int j = 0; j < erjiFile.length; j++) {
				 System.out.println("��������ļ�"+erjiFile[j].getName());
				 
	}
		}
		 
		
	}
	 System.out.println();
	 System.out.println();
	

	}
	
	

}
