package com.day17;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
 * ��ӡ��
 * 
 * %f:������---����ʽ����ӡʱ�򸡵����͵�����
 * %d:����
 * %c�������ַ�
 * %s���ַ���
 */
public class Text3 {
	public static void main(String[] args) throws FileNotFoundException {
		String name="�迭";
		int age=18;
		float java=98;
		for (int i = 0; i < args.length; i++) {
			
		}
		PrintStream a=new PrintStream("D:\\fis.txt");
		//a.println(name);
		//a.println(age);
		//a.println(java);
		a.print("-------�Ϻ迪��ѧϰ�ɼ�-----");
		a.println("NO.1-------");
		a.printf("������%s  ���䣺%d java�ɼ���%f",name,age,java);		
	}

}
