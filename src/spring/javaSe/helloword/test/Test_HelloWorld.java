package spring.javaSe.helloword.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.javaSe.helloword.bean.HelloWorld;

public class Test_HelloWorld {

	@SuppressWarnings("resource")
	@Test
	public void say(){
		//此时为了方便做单元测试，故使用FileSystemXmlApplicationContext-获取配置文件的路径
		ApplicationContext ctx = new FileSystemXmlApplicationContext(
				"WebContent/WEB-INF/conf/applicationContext-javasebeantest.xml");
		
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		
		helloWorld.say();

	}
}
