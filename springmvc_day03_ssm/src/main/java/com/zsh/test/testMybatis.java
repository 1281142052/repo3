package com.zsh.test;

import com.zsh.dao.AccountDao;
import com.zsh.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testMybatis {
    @Test
    public void fun() throws IOException {
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);
        List<Account> all = dao.findAll();
        for (Account ac  : all) {
            System.out.println(ac);
        }
        session.close();
        in.close();
    }
    @Test
    public void fun2() throws IOException {
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);
        Account account = new Account();
        account.setName("yrj");
        account.setMoney(200d);
        dao.saveAccount(account);
        //提交事务
        session.commit();
        session.close();
        in.close();

    }
}
