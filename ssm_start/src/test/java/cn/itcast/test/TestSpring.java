package cn.itcast.test;


import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    @Test
    public void test(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountService as = (AccountService)ac.getBean("accountService");

        List<Account> accounts = as.findAll();

        System.out.println(accounts);
    }
}
