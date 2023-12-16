package com.app.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {
	
	@Before("execution(public void com.app.aopdemo.dao.AccountDao.addAccount())")
	public void addBeforeAdvice()
	{
		System.out.println("@Before Advice Invoked before addAcount");
	}

}
