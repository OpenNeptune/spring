package spring.javaSe.helloword.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.javaSe.helloword.bean.HelloWorld;

public class Test_HelloWorld {

	@SuppressWarnings("resource")
	@Test
	public void say(){
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext(
				"WebContent/WEB-INF/conf/applicationContext-javasebeantest.xml");
		
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		
		helloWorld.say();

	}
}
