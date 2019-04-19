package zia.edu.boot.boot_test1.service;

import org.springframework.stereotype.Service;
import zia.edu.boot.boot_test1.entity.Account;

@Service
public class MyService {
    public String getName(){
        return "sjlee";

    }
    public Account getAcceount(){
        Account account=new Account();
        account.setId((long)1);
        account.setPassword("test1234");
        account.setUsername("sjlee");


        return account;
    }
    public Account getAccount(){
        Account account=new Account();
        account.setId((long)1);
        account.setPassword("test1234");
        account.setUsername("sjlee");


        return account;
    }
}

