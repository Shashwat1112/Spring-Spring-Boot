package com.app.aopdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.app.aopdemo.dao.AccountDao;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.app.aopdemo")
public class DemoConfig {
	
	@Bean(name="bean1")
	public AccountDao accDao()
	{
		return new AccountDao();
	}

}
