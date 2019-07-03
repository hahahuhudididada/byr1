package com.glls.day2.sec3;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.Test;

/**
 * java 中的数据类型
 * 
 * 基本数据类型
 * 	 1.整形数据           -64 -32 -16 -8 -4 -2 -1
 * 		--  byte   1 字节     -128 - 127       -2^7 ----2^7-1    1000 0000  --   01111111
 *   	--  short  2字节     -2^15----2^15-1
 *      --  int    4字节   -2^31 ----2^31-a
 *      --  long   8字节   -2^63 ----2^63-1
 *   2.浮点型数据
 *   	--  float  4 字节  单精度浮点型     可以精确到7位有效数字   大部分情况下  float 的 精确度很难满足需求 所以 double 使用的多
 *      --  double 8字节  双精度浮点型    精确度是 float 的两倍   表示浮点型数据  大部分情况 使用 double
 *      	浮点型数据  计算的时候 存在 误差  所以 在 需要 高精度的计算场景   需要 别的处理哦方式 比如 ： BigDecimal 类 
 *   3. 字符型数据类型
 *   
 *      --  char 字符型    2 个 字节        char 类型数据  表示 unicode 编码表  中的 字符数据    可以表示  65536 个
 *      字符  ，包含了 ascll 码   ascll 码占一个字节 允许有128 个 字符  是 unicode 码表的前 128 个字符 
 *      char 类型数据 在内存中 存储的是 该 字符的 unicode 编码值   所以   char 类型 可以当 int 类型来处理
 *      
 *      字符类型 一个重要的应用场景：   转义字符   '\n'  '\t'      转变  \  后的 字符 的含义
 *   4. 布尔数据类型
 *     --  boolean  占 1 位    不是一个字节  所以 只能存储两个值     true   false  
 *       经常在  流程控制  或者  逻辑判断 中 使用   
 * 引用数据类型
 * 	类类型
 *  接口类型
 *  数组类型
 * 
 * 注意：  整形常量  和  浮点型常量 的 默认 数据类型 分别是  int  和  double
 * 
 * 
 * 
 * 原码  反码 补码      
 * 正数： 原码  反码 补码 都一样         byte 123   0111 1111     short 127    0000 0000 0111 1111    int 127  00000000 00000000 00000000 0111 1111   
 * 负数：                                                                   
 * 		-1的原码   1000 0001   
 *         反码    1111 1110
 *         补码    1111 1111
 *         
 *         
 *         
 *         补码：1000 0000   减1得反码     10111 1111     11000 0000     -128    
 * */
public class _3DataTypeDemo {
	public static void main(String[] args) {
		
		// 定义了 byte 类型的变量  变量名a     赋值 1 
		byte a = -128;  
		// 定义short类型的变量 b  赋值为2
		short b=2;
		// 定义int 类型的变量c  赋值为3
		int c =3;
		// 定义long 类型的变量 d  赋值为 4
		long d=4L;        //  ???  为什么加L和不加L 都正确   表示  这个常量 是 long 类型的常量    如果 不加L  表示 4 是 int 类型的常量 
		// 定义float 类型 便令e  赋值 3.3
		float e = 3.3f;   //  ??? 为什么 这里  一定要 加  f 或者 F
		// 定义 double 类型的变量 f 赋值 3.14
		double f = 3.14;
		
		// 定义 char 类型的 变量 g  赋值  'A'
        char g = 'A';	
        
        char h = 97;
        
        System.out.println(h);
        
        System.out.println("\"");
        System.out.println("ab\ncd");
		
        // 定义 boolean 类型的变量
        boolean flag = true;
        boolean flag2 = false;
        
        
	}
	
	@Test
	public void test1(){
		// 定义 int 类型 的 变量        占 4 个字节      整形数据默认的数据类型  就是 int 类型 
		int age = 12;  
		//age = 13L;   // int 类型的变量 只能存储 int 类型的数据
		
		byte b = 3;
		
		age = b;   //  自动数据类型转换
	}
	@Test
	public void test2(){
		 // 定义 byte 类型变量
		byte b =127;   //  1 个 字节   
	}
	
	@Test
	public void test3(){
		// 定义 short 类型变量
		short b =127;   //  2 个 字节       -2^15 ---2^15-1
	}
	@Test
	public void test4(){
		// 定义 long 类型的变量
		long num =22L;    // 8 个字节  -2^63----2^63-1   
	}
	
	@Test
	public void test5(){
		// 定义 float 类型的 变量  单精度浮点型       4 个字节 
		float f = 3.14F;    //  要知道 为什么 3.14 后面 要加 F

	}
	
	@Test
	public void test6(){
		// 定义 double 类型的变量   8个字节
		double d = 3.14;
		
	}
	
	
	@Test
	public void test7(){
		// 布尔类型
		boolean flag = true;   // 占 1 位  
	}
	
	
	@Test
	public void test8(){
		// char 类型变量    表示 unicode 编码表中的字符       在内存中 存储的是 该 字符的 unicode 编码值   所以   char 类型 可以当 int 类型来处理
	
	    char c = 'a';   // 97
	    char c2= 'A';   // 65
	    
	    int num = c+c2;
	    
	    System.out.println(num);
	}
	
}
