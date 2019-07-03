package com.glls.day2.sec3;
/**
 * 上一节  咱们学习了  java 中的 常量 ，常量数据 只是一个 死的数据 ，没有办法  取 存储   计算，那么 只有这样的数据是没有意义的
 * 因为 只有常量数据  没办法 描述现实中的逻辑
 * 
 * 问题：那么怎么去存储  或者 计算 这些数据呢？  操作这些数据 ，让其具有意义呢？
 * 		  需要  变量  
 * 
 * 变量：通过变量  可以 存储 和 操作数据   变量的本质 是 计算机中 的 一块内存
 * 
 *   需求：  计算  两个人的年龄之和       让计算机 先存储 第一个人的年龄  再存储第二个  再相加   具体如何实现   就需要变量
 *   	int age1   表示  一个变量     把常量 存到变量中   int age1 =22;   现在  age1 这个 变量 就记住了 22 这个常量
 * 		int age2 =28 
 * 		int result = age1+age2;   result 这个变量  就存储了  计算结果
 * 
 * 
 *  变量如何来定义：
 * 	   变量的数据类型   变量名 ;     //  声明了一个变量
 *   变量名 = value;    //  给变量赋值
 *   
 *   变量的数据类型    变量名  =  value;    //  声明变量 并赋值   
 * 
 * 	 变量的数据类型 ：  double int  都是 数据类型的一种  下一节讲
 *  变量名   标识符
 *  =  赋值运算符   下下节讲
 *  value  一个 数据  （体现形式    常量值     变量    表达式）
 * 
 * 
 *  要使用一个变量  这个变量得先初始化   即  要有值
 * 
 * 
 * */
public class _2VarDemo {
	public static void main(String[] args) {
		//  计算  圆的面积   半径为2
	
		double r  = 2;  
		double PI = 3.14;
		
		double s = PI*r*r;    // 定义变量 s  存取计算的结果
		
		int a,b,c;
		a=2;
		b=1;
		
		c = a+b;  // 要是用变量   变量得先有值
	
	}
}
