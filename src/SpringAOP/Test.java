package SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import SpringAOP.ORM.User;
import SpringAOP.Service.UserService;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"WebContent/WEB-INF/conf/applicationContext-aop.xml");
		
		UserService userService =(UserService) context.getBean("userService");
		
		System.out.println(userService.getClass());
		
		userService.add(new User(System.currentTimeMillis(),"SpringAOP"));
	}
}
