package com.wanshan.tuanyuan.service;

import com.wanshan.tuanyuan.entity.Account;
import com.wanshan.tuanyuan.util.Result;

import javax.annotation.Resource;

public interface IAccountService {

    /**
     * 账号添加
     * @param account
     * @return
     */
    Result<Account> add(Account account);

}
