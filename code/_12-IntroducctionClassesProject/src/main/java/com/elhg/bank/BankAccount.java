package com.elhg.bank;

import java.math.BigDecimal;

public class BankAccount {
    private String accountNumber;
    private BigDecimal accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this.accountBalance = new BigDecimal("0.0");
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds (BigDecimal quantity){
        this.accountBalance = this.accountBalance.add(quantity);
    }

    public void withDrawFunds (BigDecimal quantity){
        if (this.accountBalance.doubleValue() < quantity.doubleValue() ){
            System.out.println("Insuficient Funds!!");
        }else{
            this.accountBalance = this.accountBalance.subtract(quantity);
            System.out.println("WithDrawal success !");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
