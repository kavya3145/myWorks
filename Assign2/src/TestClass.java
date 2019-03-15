

import java.util.List;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
	
	public class TestClass {	

		public static void main(String[] args) {
		
			ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		 ListDemo list=(ListDemo)context.getBean("demo");
//			list.show();
			
			MapAnswers Map=(MapAnswers)context.getBean("q");
			Map.displayInfo();
		}
		

	}

