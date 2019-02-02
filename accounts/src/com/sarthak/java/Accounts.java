package com.sarthak.java;

public class Accounts {
    float bal;
    int accno;
    float wd;
    float dp;
    Accounts()
    {

    }
    Accounts(int no)
    {
     this.bal=no;
    }
    public void credit(float dp)
    {
        bal+=dp;
    }
    public  float debit(float wd)
    {
       if(bal-wd<500)
        return bal;
       else
           return bal-=wd;
    }

}
