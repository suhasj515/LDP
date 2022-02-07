package com.spring.aopdemo.main;

import com.spring.aopdemo.Account;
import com.spring.aopdemo.dao.AccountDAO;
import com.spring.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterThrowingDemoApp {

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
        List<Account> accountList= null;
        try {
            boolean throwException=true;
            accountList=accountDAO.findAccounts(throwException);
        }
        catch (Exception e){
            System.out.println("MAIN program caught exception"+e);
        }

        System.out.println("MAIN PROGRAM --Account list are :"+accountList+"\n\n");



        //close the context
        context.close();
    }
}
