package com.day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * java io �����ĸ������ࣺ���������/��д
 * 
 * ���ķ��ࣺ
 * 
 *���������ʱ����for �������Ͽ��ʱ��foreach
 *
 * file��
 * String name="tom";
 * String[] arr=new String[2];
 * arr[0]=neame;
 * 
 * read()-->����һ���ֽ�����
 */
public class Text1 {
	public static void main(String[] args) {
		byte[] bytearr=new byte[50];//����һ��50���ֽڳ��ȵ�����
		//�ļ���λ
		try{
			FileInputStream fis=new FileInputStream("D:\\fis.txt");
			FileOutputStream fos=new FileOutputStream("D:\\fos.txt");
			//����io��д
			int s;
			try {
				while ((s=fis.read())!=-1) {
				fos.write(s);
					
				}
				fos.close();//�ر������
				fis.close();//�ر�������
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		} 
		catch(Exception e2) {
			// TODO: handle exception
		}
	
	}
	

}
