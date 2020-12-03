# Java-11.23


## 1. 实验目的
1.掌握字符串String及其方法的使用  
2.掌握文件的读取/写入方法  
3.掌握异常处理结构  

## 2. 实验要求
1.设计学生类  
2.采用交互式方式实例化某学生；  
3.设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。  

## 3. 实验设计

  设置Student类中的对象和方法
```
  	//创建关于学生的属性
	String name;							//关于学生的姓名
	String code;							//关于学生的编号
	String sexy;							//关于学生的性别
	String age;								//关于学生的年龄
	String grade;							//关于学生的班级
	String major;							//关于学生的专业
	//构造函数
 ``` 
  ```
  	public String toString() {				//重写toString()方法
		String information = "姓名："+name+"学号："+code+"年龄："+age+"班级："+grade+"专业："+major;
		return information;
	}
	
```
 ## 4. 核心方法
 
  通过输入字节流和输出字节流的方式使古诗规格化输出。
  
  ```
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
	 
   ```
   
   ## 5. 实验结果截图
   
https://github.com/1141565458sws/Java-11.23/blob/main/sws.png

  ## 6.实验感想

1.学会了如何使用输入字节流和输出字节流对文字的规格化输出  
2.学会了tostring如何进行输出学生的信息  
3.掌握了异常处理结构   
4.本次的实验使我对java有了更深一步的理解  
