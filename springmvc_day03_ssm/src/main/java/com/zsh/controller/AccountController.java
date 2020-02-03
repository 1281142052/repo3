package com.zsh.controller;

import com.zsh.domain.Account;
import com.zsh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService service;

    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("进来了");
        List<Account> list = service.findAll();
        for (Account ac  : list) {
            System.out.println(ac);
        }

        return "success";
    }

    @RequestMapping("/save")
    public String save(Account account){
        service.saveAccount(account);
        return "redirect:findAll";
    }
}
