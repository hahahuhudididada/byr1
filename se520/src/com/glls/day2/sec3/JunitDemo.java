package com.glls.day2.sec3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * junit 单元测试  
 * 
 * 1. 引入 单元测试的  junit 依赖包
 * 
 * 2. 定义方法  public void test1(){  测试代码   }
 * 
 * 3.在方法正上方 加 @Test  注解
 * 
 * 4.双击 方法名   点右键  run as  Junit Test   出现 绿条  表示 测试通过   出现红条 则有问题
 * 
 * 5. 注意   咱们使用的 是 别人写好的  Test 类 ，自己 就不能创建  名为  Test 的类了
 * */
public class JunitDemo {
	public static void main(String[] args) {
		int a = 2;
		
		System.out.println(a);
		
		double b =3.2;
		
		System.out.println(b);
	}
	
	@Before
	public void doBefore(){
		System.out.println("测试方法前 的 准备工作");
	}
	
	@After
	public void doAfter(){
		System.out.println("测试方法后 的 收尾工作");
	}
	
	
	
	@Test
	public void test1(){
		int a = 2;
		
		System.out.println(a);
	}
	
	@Test
	public void test2(){
		double b =3.2;
		int a = 3/0;
		System.out.println(b);
	}
	
	
	
	
}
