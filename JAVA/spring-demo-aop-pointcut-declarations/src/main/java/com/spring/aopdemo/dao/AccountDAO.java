package com.spring.aopdemo.dao;

import com.spring.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    private String name;
    private String serviceCode;

    public String getName() {
        System.out.println("get name");
        return name;
    }

    public void setName(String name) {
        System.out.println("set name");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println("get service code");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println("set service code");
        this.serviceCode = serviceCode;
    }

    public void addAccount(Account account, boolean vip){
        System.out.println(getClass()+ ": Adding account jdbc work");
    }

    public boolean doWord(){
        System.out.println("doing some work in Account");
        return false;
    }
}
