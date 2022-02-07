package com.spring.aopdemo.dao;

import com.spring.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(Account account,boolean vip){
        System.out.println(getClass()+ ": Adding account jdbc work");
    }

    public boolean doWord(){
        System.out.println("doing some work in Account");
        return false;
    }
}
