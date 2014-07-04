package SpringSE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Context {
	public static ApplicationContext getAppContext(){
		//此时为了方便做单元测试，故使用FileSystemXmlApplicationContext-获取配置文件的路径
		ApplicationContext ctx = new FileSystemXmlApplicationContext(
				"WebContent/WEB-INF/conf/applicationContext-javasebeantest.xml");
		return ctx;
	}
}
