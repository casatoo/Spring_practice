package spring.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.AOP.entity.Exam;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/AOP/setting.xml");
		
		Exam exam = (Exam) context.getBean("exam");
		
		
		System.out.printf("total is %d\n",exam.total());
		System.out.printf("avg is  %f\n",exam.avg());
		/*
		Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), new Class[] {Exam.class}, new InvocationHandler() {
			
		 	Exam exam = new NewlecExam(1,1,1,1);
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				
				long start = System.currentTimeMillis();
				
				Object result = method.invoke(exam, args);
				
				long end = System.currentTimeMillis();
				
				String message = (end - start) + "ms 시간이 걸렸습니다.";
				
				System.out.println(message);
				
				return result;
			}
		});
		*/
	}

}
