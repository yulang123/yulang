package com.day20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用缓冲流
 * 字节缓冲流
 * @author yulang
 *
 */
public class Text1 {
	public static void main(String[] args) throws IOException {
		
	
	//创建两个文件
	File file=new File("D:\\file2.txt");
	File file2=new File("D:\\filedome.txt");
	//读写：FileInput... FileOutput
	FileInputStream fis=new FileInputStream(file);
	FileOutputStream fos=new FileOutputStream(file2);
	//BufferedInputStream(流，缓冲的字节大小)
	BufferedInputStream bis=new BufferedInputStream(fis,256);
	BufferedOutputStream bos=new BufferedOutputStream(fos,256);
	//int s;
	//while ((s=bis.read())!=-1) {
	//	bos.write(s);
			
	//}
	byte[] byt=new byte[10];
	while (bis.read(byt)!=-1) {
		bos.write(byt);
		
		
	}
	bos.close();
	bis.close();
	
	

}
}
