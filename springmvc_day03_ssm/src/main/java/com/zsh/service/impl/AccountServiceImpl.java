package com.zsh.service.impl;

import com.zsh.dao.AccountDao;
import com.zsh.domain.Account;
import com.zsh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao dao;
    public List<Account> findAll() {
        System.out.println("业务层查询所有信息");
        List<Account> list = dao.findAll();
        return list;
    }

    public void saveAccount(Account account) {
        dao.saveAccount(account);
        System.out.println("业务层保存信息");
    }
}
