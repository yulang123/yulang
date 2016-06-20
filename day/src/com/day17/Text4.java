package com.day17;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
 * java io
 * 对象流
 * 类--》对象--》保存到数据库中
 *                 文件中
 *                 一个对象在保存的时候必须要实现序列化
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
 * 重写tostring地方法：
 * 打印对象的信息
 * 类名@hashcode值
 * this
 * 
 */

	
	
	
	
}