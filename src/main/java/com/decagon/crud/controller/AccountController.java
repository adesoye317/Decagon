package com.decagon.crud.controller;

import com.decagon.crud.model.Account;
import com.decagon.crud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @GetMapping("/{accountNumber}/balance")
    public BigDecimal getBalance(@PathVariable String accountNumber) {
        return accountService.getBalance(accountNumber);
    }

    @PostMapping("/{accountNumber}/deposit")
    public void deposit(@PathVariable String accountNumber, @RequestParam BigDecimal amount) {
        accountService.deposit(accountNumber, amount);
    }

    @PostMapping("/{accountNumber}/withdraw")
    public void withdraw(@PathVariable String accountNumber, @RequestParam BigDecimal amount) {
        accountService.withdraw(accountNumber, amount);
    }
}

