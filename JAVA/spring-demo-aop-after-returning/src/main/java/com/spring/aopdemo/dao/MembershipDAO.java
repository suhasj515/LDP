package com.spring.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void addMembershipAccount(){
        System.out.println(getClass()+ ": Adding from membershipDAO account jdbc work");
    }
}
