import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(public String getName())")
	public void getNameAdvice(){
		System.out.println("Executing Advice on getEname()");
	}
	
//	@Before("execution(* *get*())")
//	public void getAllAdvice(){
//		System.out.println("Service method getter called");
//	}
}


