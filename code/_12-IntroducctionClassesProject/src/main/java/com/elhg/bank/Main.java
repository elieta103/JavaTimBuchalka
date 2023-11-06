package com.elhg.bank;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setCustomerName("Eliel Herrera");
        account.setEmail("mail@mail.com");
        account.setPhoneNumber("5521212302");
        account.setAccountBalance(new BigDecimal("1000.00"));
        account.setAccountNumber("39092");

        System.out.println(account);
        account.depositFunds(new BigDecimal("500"));
        System.out.println(account);
        account.withDrawFunds(new BigDecimal("3000"));
        System.out.println(account);
    }
}
