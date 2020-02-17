package cn.itcast.test;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestMybatis {

    @Test
    public void test() throws Exception {
//        InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
//        SqlSession session = factory.openSession();
//
//        AccountDao dao = session.getMapper(AccountDao.class);
//        List<Account> accounts = dao.findAll();
//        System.out.println(accounts);
//        session.close();
//        is.close();
    }
}