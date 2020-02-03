package com.zsh.test;

import com.zsh.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void fun(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService service = (AccountService) ac.getBean("accountService");
        service.findAll();
    }
}
