package SpringAOP.Interceptor;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserIterceptor {
	//定义任何方法调用的切入点
	@Pointcut("execution(* SpringAOP.Service.UserService.*(..))")
	public void Allmethod(){}
	
	private Long startTime;
	
	private Long endTime;
	
	//在调用方法前加入切入点
	@Before("Allmethod()")
	public void beforeMethod() {
		startTime =System.currentTimeMillis();
	}
	
	//在调用方法后加入切入点
	@After("Allmethod()")
	public void afterMethod() {
		endTime =System.currentTimeMillis();
		System.out.println("runtime:"+(endTime - startTime));
	}
	
}
