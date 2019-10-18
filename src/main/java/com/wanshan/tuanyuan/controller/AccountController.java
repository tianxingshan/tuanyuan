package com.wanshan.tuanyuan.controller;

import com.wanshan.tuanyuan.entity.Account;
import com.wanshan.tuanyuan.service.IAccountService;
import com.wanshan.tuanyuan.util.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AccountController {

    @Resource
    private IAccountService accountService;


    @PostMapping("/account/add")
    public Result<Account> add(@RequestBody Account account){
        return accountService.add(account);
    }

}
