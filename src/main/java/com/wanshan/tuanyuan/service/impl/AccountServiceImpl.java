package com.wanshan.tuanyuan.service.impl;

import com.wanshan.tuanyuan.dao.IDaoService;
import com.wanshan.tuanyuan.entity.Account;
import com.wanshan.tuanyuan.service.IAccountService;
import com.wanshan.tuanyuan.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements IAccountService {

    @Resource
    private IDaoService dao;

    @Override
    public Result<String> add(Account account) {
        dao.save(account);
        return new Result<>(account.getId());
    }
}
