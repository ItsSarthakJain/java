package com.sarthak.java;

public class Bank {
    private long acc_no;
    private int balance;
    private String Customer_name;
    private String Email;
    private long phone_no;

    public void setAcc_no(long acc_no)
    {
        this.acc_no = acc_no;
    }
    public long getAcc_no()
    {
        return this.acc_no;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance()
    {
        return this.balance;
    }

    public void setCustomer_name(String Customer_name)
    {
        this.Customer_name=Customer_name;
    }
    public String getCustomer_name()
    {
        return this.Customer_name;
    }
    public void setEmail(String Email)
    {
        this.Email = Email;
    }
    public String getEmail()
    {
        return this.Email;
    }
    public void setPhone_no(long Phone_no)
    {
        this.phone_no=Phone_no;
    }
    public long getPhone_no()
    {
        return this.phone_no;
    }
    public void deposit(int deposit)
    {
        this.balance+=deposit;
        System.out.println(deposit + " deposited sucessfully in the account\nDeposit sucessfull");
    }
    public void withdrawl(int withdraw)
    {
        if(this.balance>=withdraw)
        {
            System.out.println("Amount sucessfully withdrawed \n" + "Ammount withdrawed = " + withdraw);
            this.balance-=withdraw;
        }
        else
            System.out.println("Dont have sufficient balance");
    }
}
