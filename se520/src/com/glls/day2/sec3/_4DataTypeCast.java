package com.glls.day2.sec3;
/**
 * 数据类型转换
 * 	在赋值运算 或者 算术运算时 会有数据类型转换的问题
 * 
 * 	基本数据类型的转换；
 * 		在算术运算时 或 赋值运算的时候   要求 数据类型形同  否则 要进行  类型转换
 *      byte short char int long float double      不涉及boolean 类型 
 * 		
 *    类型转换的方向
 *    	byte ---short,char --- int ---long ---float ---double
 *    
 *    
 *    算术运算时  数据类型转换
 *    3 + 'a' +5L + 3.2;    最大的数据类型是 double  所以  会先统一数据类型 为 double 再计算
 *    
 *    赋值运算的时候
 *       左 = 右   当 左边的数据类型 等于 右边的  没有数据类型转换
 *       
 *       左< 右    int a = 3.2 +3;  这时    需要   int num4 = (int) (3.2 +3);  强制类型转
 *       左> 右    double num6 = 6;    自动类型转换  
 *    
 *    
 *  引用数据类型的转换
 *     ---- 以后再讲
 * 
 * */
public class _4DataTypeCast {
	public static void main(String[] args) {
		//int  num = 3 + 'a' +5L + 3.2;  //  3.0 + 97 + 5.0+3.2
	
		float num = 3+ 'a' + 5L + 3.2f;
		
		/*
		 * short 和 char 的 取值区间不同   没有谁大谁小的说法  具体问题具体分析
		 * 
		 * short s = 'a';
		short a=2;
		char c = a;
		
		char c2 = 'a';
		short sh = c2;*/
		
		long num2 = 3L;
		
		int num3 = (int) num2;   // 强制类型转换
		
		num3 = 'a';   //  自动类型转换
		
		int num4 = (int) (3.2 +3);
	
		int num5 = (int) 3.2;
		System.out.println(num5);
		
		double num6 = 6;
		
		
		// 特殊情况
		
		byte num7 =127;   // 7 是int 类型 在这里可以直接转为 byte 类型  因为7 没有超出byte 的范围
		// byte short  char  只要不超出各自数据类型的范围  都可以直接把整形常量的值 赋给该类型  
	
	
		short num8 =8;
		
		//short num9 = num8+8;  // 不确定这样写  是否超出 num9 的范围 
		
		num8+=8;  //  num8 = (short)(num8+8);   复合的赋值运算符    隐藏的类型转换
	}
}
