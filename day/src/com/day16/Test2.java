package com.day16;

import java.io.File;
import java.io.FilenameFilter;
/**
 * ����һ���ļ���������ļ�
 * ���磺���ء�.doc
 * @author yulang
 *
 */
public class Test2 {
	public static void main(String[] args) {
		File f=new File("D:\\Ԥ����ѧԱ��ѧ����");
		File fileList[]=f.listFiles();
		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].getName().endsWith(".txt")) {
				System.out.println(fileList[i].getName());
			}
		
		}
//		����f.list-->���ļ��������е��ļ�����ɵ�String����
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
 * String name:�ļ�������
 * File file���ļ�
 */
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(".txt");
	}
	
}