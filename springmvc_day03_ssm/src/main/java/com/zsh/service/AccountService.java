package com.zsh.service;

import com.zsh.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {

    //查询所有账户信息
    public List<Account> findAll();
    //保存账户信息
    public void saveAccount(Account account);
}
