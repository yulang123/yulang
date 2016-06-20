package com.day16;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * 计算机在运行期间是否需要数据？数据来自那些方面？
 * 1.Scanner:键盘输入
 * 2.计算机本地数据【磁盘文件】
 * 3.网络请求数据【用户登录系统】
 * IO作用：体现在用户保存数据或者从硬盘读取数据
 * Mysql:保存用户数据，或者从硬盘读取数据---》》他是一个数据库管理系统，可以更加方便的管理数据
 * -------
 * Java IO流
 * 1.从流的方向来看，输入流，输出流
 * 2.从流的数据处理单位来看：字节流和字符流
 * --------
 * 实际应用中可以把这两者结合起来看
 * 输入字节流    输入字符流
 * 。。                         。
 * io包中两个流的继承体系：
 * 1.以字节为单位处理xxxxStream
 * 2.  字符为             xxxxReader
 * 针对字节：InputStream outputStream 字节输入输出
 * 针对字符：Reader（读 输入） Writer（写，输出） 字符的输入输出 java里规定%@&为字符
 * -------------------
 * java里采用的是unicode编码集，utf8保留了unicode的特性，》》》gbk
 * utf8和unicode在编码存储上有些不同，中文3个字节，英1个
 * 
 * 
 * @author yulang
 *
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
	//windows系统路径分隔符\linux系统分隔符
	 File file=new File("D:\\fileTest.txt");
	if (file.exists()){
		 file.delete();//删除文件
	 }else {
		 file.createNewFile();
		System.out.println("创建文件");
		
	}
	System.out.println("文件大小："+(file.length()) +"字节");
	 File[] files=file.listFiles();
	 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//格式化日期
	 for (int i = 0; i < files.length; i++) {
		 System.out.println(files[i].getName());
		 System.out.println("最后一次修改的时间"+sdf.format(files[i].lastModified()));
		
		 if (files[i].isDirectory()) {
			 File[] erjiFile=files[i].listFiles();//二级文件夹
			 for (int j = 0; j < erjiFile.length; j++) {
				 System.out.println("进入二级文件"+erjiFile[j].getName());
				 
	}
		}
		 
		
	}
	 System.out.println();
	 System.out.println();
	

	}
	
	

}
