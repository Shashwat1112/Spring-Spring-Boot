package com.app.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.aopdemo.dao.AccountDao;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDao a = context.getBean("bean1",AccountDao.class);
		a.addAccount();
		
		
	}

}
