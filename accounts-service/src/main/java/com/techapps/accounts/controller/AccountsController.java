package com.techapps.accounts.controller;

import com.techapps.accounts.entity.Accounts;
import com.techapps.accounts.service.AccountsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/v1/accounts")
public class AccountsController {

    @Autowired
    private AccountsService accountsService;

    @PostMapping(value = "/create-account")
    public ResponseEntity<Accounts> createAccount(@RequestBody Accounts accounts) {

        return new ResponseEntity<Accounts>(accountsService.createAccount(accounts), HttpStatus.OK);
    }


    @GetMapping(value = "/accountByCustomerId/{customerId}")
    public ResponseEntity<Accounts> accountByCustomerId(@PathVariable String customerId) {

        return new ResponseEntity<Accounts>(accountsService.getAccountsByCustomerId(customerId), HttpStatus.OK);
    }
}
