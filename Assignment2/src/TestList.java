import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
	
	public class TestList {	

		public static void main(String[] args) {
		
			ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		 List list=(List)context.getBean("demo");
			list.show();
		}

	}


