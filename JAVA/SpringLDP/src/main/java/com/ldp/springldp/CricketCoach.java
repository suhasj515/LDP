package com.ldp.springldp;

public class CricketCoach implements Coach{

    private FortuneServiceLucky fortuneServiceLucky;
    private String emailAddress;
    private String team;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setFortuneServiceLucky(FortuneServiceLucky fortuneServiceLucky) {
        System.out.println("Inside setter::CricketCoach");
        this.fortuneServiceLucky = fortuneServiceLucky;
    }

    CricketCoach(){
        System.out.println("Inside default constructor::CricketCoach");
    }


    @Override
    public String getDailyWorkOut() {
        return "Practice bowling for 3 hrs";
    }

    @Override
    public String getDailyFortune() {
        return fortuneServiceLucky.getFortune();
    }
}
