package com.glls.day2.sec3;
/**
 * 程序 是由  指令     + 数组  构成的 
 * 	数据 在 程序中的体现形式是什么？  最基本的体现形式  就是  变量 和 常量 
 * 
 * 常量： 表示不能改变的     数据  
 * 变量： 计算机 通过变量   操作数据    存储一个 可以发生变化的数据    变量的本质  对应 计算机中的 一块内存
 * 
 * 
 * java 中的常量分类
 * 	数值类型的常量
 * 	-- 整数常量
 *  -- 小数常量
 *  
 *  布尔型常量
 *  	true     false 
 *  
 *  字符型常量   将一个数字  或者 字母   用 单引号  标识      'a'   'A'    '2'    一对单引号中 只能写 一个字符
 * 
 *  字符串常量
 *  	将一个  或多个字符  用  双引号 标识    字符串中的字符个数不限  "hello"   "123"  "a"
 *     注意：  字符 和 字符串 的 区别
 *     
 *  null 常量     空值    只有一个值     null     
 * */
public class _1ConstDemo {
	public static void main(String[] args) {
		System.out.println(2);
		System.out.println(2.2);
	
		System.out.println(true);
		System.out.println(false);
		
		System.out.println('2');
		System.out.println('A');
		
		System.out.println("hello");  //   'h''e''l''l'
		
		//System.out.println(null);  println  是一个方法   方法的参数 不能是 null 
	}
}
