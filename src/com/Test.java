package com;

import java.io.*;
import java.util.Scanner;

public class Test {
	public static void show() {
		Student student = new Student();
		Scanner scanner = new Scanner(System.in);
		//请输入姓名，编号，性别，年龄，班级，专业;
		System.out.print("请输入姓名\n");
		student.name = scanner.next();
		System.out.print("请输入学号\n");
		student.code = scanner.next();
		System.out.print("请输入性别\n");
		student.sexy = scanner.next();
		System.out.print("请输入年龄\n");
		student.age = scanner.next();
		System.out.print("请输入班级\n");
		student.grade = scanner.next();
		System.out.print("请输入专业\n");
		student.major = scanner.next();
		System.out.println(student.toString());
	}
	
	public static void txt(){
		File file = new File("E:\\sws.txt");
		try {
			FileReader fInputStream = new FileReader(file);
			FileWriter fOutputStream  = new FileWriter("E:\\sws2.txt");
			int p=(int)file.length();
			char[] a = new char[p];
			fInputStream.read(a);
			int x=0;
			int y=7;
			for(int j = 7;j<=file.length()-470;j=j+7,x+=7,y+=7) {
				if(j%2==0) {
					for(int i=x;i<j;i++) {
						char c=a[i];
					fOutputStream.write(c);
					}
					fOutputStream.write(".\n");
					
				}else {
					for(int i=x;i<j;i++) {
						char c=a[i];
					fOutputStream.write(c);
					}
					fOutputStream.write(",");
				}
			}
			
			fInputStream.close();
			fOutputStream.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}