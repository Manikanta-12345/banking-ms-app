package com.techapps.accounts.service;

import com.techapps.accounts.entity.Accounts;
import com.techapps.accounts.repository.AccountsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AccountsService {


    @Autowired
    private AccountsRepository accountsRepository;

    public Accounts createAccount(Accounts accounts){
        log.info("accounts creation started in AccountsService");
        accounts = accountsRepository.save(accounts);
        log.info("accounts creation completed in AccountsService");
        return accounts;
    }


    public Accounts getAccountsByCustomerId(String customerId){
        log.info("accounts by customerId started in AccountsService");
        Accounts accounts = accountsRepository.findByCustomerId(customerId);
        log.info("accounts by customerId completed in AccountsService");
        return accounts;
    }
}
