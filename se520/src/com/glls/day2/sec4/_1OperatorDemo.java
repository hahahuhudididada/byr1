package com.glls.day2.sec4;

import org.junit.Test;

/**
 * java 中的运算符
 * 	1.算术运算符
 *  	--  +  -  *  %  /   ++  -- 
 *  2.赋值运算符  
 *  	--  =   +=  *=  /=  %=
 *  3.比较运算符 （关系运算符）
 *  	--  >  <   >=   <=   ==  !=
 *  
 *  4.逻辑运算符
 *  	--  ||  &&  !    |  &  
 *  5.条件运算符 (三目运算符)
 *  	--   exp1? result1  : result2;  
 *  6.位运算（了解）
 * 
 * 相关的概念
 * 	+ - * 。。。  运算符  
 * 5 + 6  表达式
 * 5  6  操作数
 * 
 * int num = 5+6;  语句
 * 
 * 
 * */
public class _1OperatorDemo {
	
	@Test
	public void test1(){
		/**
		 * 算数运算符的使用
		 * 
		 * */
	
		int num1 = 3;
		int num2 = 5 ;
		double num3 = 3.14;
		String str = "hello";
		int age =22;
		// + 运算符  如果 操作数都是数值类型  就进行 数值 加的运算  如果 有一个操作数 是 字符串  就进行 字符串拼接的操作
		System.out.println(num1+num2);
		System.out.println(num1+num3);
		System.out.println(num1+str);  // 3hello
		System.out.println("我今年"+age+"岁了");
		System.out.println(+3);   
		// - 减 运算符
		System.out.println(num2-num1);
		// *  乘
		System.out.println(num2 * num1);
		
		// 除
		System.out.println(7/5);   //  注意    数据类型    两个int 类型 计算 结果 也是int
		
		System.out.println(3.0/5);
		//  模  %   求余数
		
		System.out.println(3%8);  // 3
		System.out.println(8%3);   // 2
		System.out.println(101%102); // 101
		System.out.println(102%101); //1
		System.out.println(100%99); //1
		System.out.println(99%100); // 99
		
		
	}
	
	@Test
	public void test2(){
		//  ++   -- 
		
		int num1 =5;
		int num2 =3;
		num1++;
		num1--;
		++num2;
		
		//System.out.println(num1);
		//System.out.println(num2);
		/**
		 * ++n    n++   作用都是  n = n+1     如果 n++;    ++n;  都是 作为 一条单独的语句 二者没有任何区别   
		 * --n    n--   作用都是  n= n-1 如果 n--;    --n;  都是 作为 一条单独的语句 二者没有任何区别   
		 * 
		 * */
		
		
		/**
		 * 如果  n++   ++n    n--   --n  不是单独的语句      ，就是说 有赋值  或 运算的操作 
		 * 这时 就需要注意   赋值 和 运算的顺序问题了
		 * int num = n++ ; 先赋值 后运算     先把n的值 赋值给 num   然后 n 自身自增1
		 * int num =++n;   先运算后赋值     n先自增1  然后 把值赋值给 num
		 * */
		
		int num3 = 4;
		int num4 = num3++;
		int num5 = ++num3;
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
	}
	
	
}
