package spring.AOP.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice{
	
	public void afterThrowing(Exception e) throws Throwable{
		System.out.println("예외가 발생하였습니다. :"+e.getMessage());
	}
}
