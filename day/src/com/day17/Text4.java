package com.day17;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
 * java io
 * ������
 * ��--������--�����浽���ݿ���
 *                 �ļ���
 *                 һ�������ڱ����ʱ�����Ҫʵ�����л�
 */
public class Text4 {
	public static void main(String[] args) throws FileNotFoundException, IOException
 {
		Student stu=new Student("caiwei",110);
		
		ObjectOutputStream fis=new ObjectOutputStream(new FileOutputStream("D:\\fis.txt"));
		fis.writeObject(stu);
		fis.close();
	}

}
/*
 * ��дtostring�ط�����
 * ��ӡ�������Ϣ
 * ����@hashcodeֵ
 * this
 * 
 */

	
	
	
	
}