package com.spring.aopdemo.main;

import com.spring.aopdemo.Account;
import com.spring.aopdemo.dao.AccountDAO;
import com.spring.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoAPp {

    public static void main(String args[]) {
        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);


        //get bean from spring container
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        MembershipDAO  membershipDAO=context.getBean("membershipDAO",MembershipDAO.class);

        //call the bussines model
        Account account= new Account();
        accountDAO.addAccount(account,true);
        accountDAO.doWord();

        membershipDAO.addMembershipAccount();


        //close the context
        context.close();
    }
}
