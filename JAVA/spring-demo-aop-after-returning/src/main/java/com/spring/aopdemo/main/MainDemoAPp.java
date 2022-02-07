package com.spring.aopdemo.main;

import com.spring.aopdemo.Account;
import com.spring.aopdemo.dao.AccountDAO;
import com.spring.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainDemoAPp {

    public static void main(String args[]) {
        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);


        //get bean from spring container
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        MembershipDAO  membershipDAO=context.getBean("membershipDAO",MembershipDAO.class);

        //call the bussines model
        Account account= new Account();
        account.setName("Manoj");
        account.setLevel("2 level");
        accountDAO.addAccount(account,true);
        accountDAO.doWord();

        //list accounts
        List<Account> accountList=accountDAO.findAccounts(false);
        System.out.println("MAIN PROGRAM --Account list are :"+accountList+"\n\n");

        //call setters for accountDAO
        accountDAO.setName("manoj");
        accountDAO.setServiceCode("AWS");

        //call getters
        accountDAO.getName();
        accountDAO.getServiceCode();

        membershipDAO.addMembershipAccount();


        //close the context
        context.close();
    }
}
