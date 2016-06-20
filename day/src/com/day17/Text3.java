package com.day17;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
 * 打印流
 * 
 * %f:单精度---》格式化打印时候浮点类型的数据
 * %d:整形
 * %c：单个字符
 * %s：字符串
 */
public class Text3 {
	public static void main(String[] args) throws FileNotFoundException {
		String name="鸿凯";
		int age=18;
		float java=98;
		for (int i = 0; i < args.length; i++) {
			
		}
		PrintStream a=new PrintStream("D:\\fis.txt");
		//a.println(name);
		//a.println(age);
		//a.println(java);
		a.print("-------严鸿开的学习成绩-----");
		a.println("NO.1-------");
		a.printf("姓名：%s  年龄：%d java成绩：%f",name,age,java);		
	}

}
