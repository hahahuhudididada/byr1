package com.glls.day2.sec2;    //  包声明语句   声明当前类在哪个包下面    一般位于 java文件的 第一行

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 标识符 ：
 * 		常量名  变量名  方法   类名  接口名  包名  等等    的  名称    都称为标识符    换句话说  在 java中  需要咱们起名字的
 * 	地方  都可以认为是  标识符
 * 
 * 标识符的命名规范是什么？
 * 		由26个英文字母大小写，数字：0-9 符号：_ $ 组成
		不能以数字开头
		不可以使用关键字
		大小写敏感    长度无限制
		可以使用中文做标识符，但是不推荐
		最好 做到 见名知意

	java 的 编程规范：
	类名 和 接口名  首字母大写  ，驼峰式的命名规范      Student     HelloWorld   如果类名由多个单词构成 那么每个单词首字母都大写
	方法名和变量名：  首字母小写   驼峰式       int maxAge;    String studentName;
	包名： 全小写
	常量名：   其实 还是定义的变量 只不过 变量存储了一个不变的值   把这种变量称为常亮     double PI;   DOUBLE MAX_NUM;
	
		
 * */
public class _1IdentifierDemo {
	
	int age;
	
	double PI;
	
	
	public void method(){
		
	}
	
	
	
}
