package com.sarthak.java;

public class Main {

    public static void main(String[] args) {
	Bank Person1 = new Bank();
	Person1.setAcc_no(1610991775);
	Person1.setBalance(1998);
	Person1.setCustomer_name("Sarthak jain");
    Person1.setEmail("me.sarthakjain@gmail.com");
    Person1.setPhone_no(1045663499);
        //System.out.println("person1 :- account no is " + Person1.getAcc_no() + " current balance is " + Person1.getBalance() + " account holder name is " + Person1.getCustomer_name() + " phone no is " + Person1.getPhone_no() + " mail id is " + Person1.getEmail());
    Person1.deposit(1000);
        //System.out.println("person1 :- account no is " + Person1.getAcc_no() + " current balance is " + Person1.getBalance() + " account holder name is " + Person1.getCustomer_name() + " phone no is " + Person1.getPhone_no() + " mail id is " + Person1.getEmail());
    Person1.withdrawl(1998);
    }
}
