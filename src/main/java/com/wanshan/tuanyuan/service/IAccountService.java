package com.wanshan.tuanyuan.service;

import com.wanshan.tuanyuan.entity.Account;
import com.wanshan.tuanyuan.util.Result;

public interface IAccountService {

    /**
     * 账号添加
     * @param account
     * @return
     */
    Result<Account> add(Account account);

}
