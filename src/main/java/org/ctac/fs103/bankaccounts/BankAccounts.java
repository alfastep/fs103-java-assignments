package org.ctac.fs103.bankaccounts;

import java.util.Scanner;
public class BankAccounts {
    private double balance;
    private String holderName;

    private int accountNumber;

    public BankAccounts(double balance, String holderName, int accountNumber) {
        this.balance = balance;
        this.holderName = holderName;
        this.accountNumber = accountNumber;
    }

    public BankAccounts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world! Welcome to the Bank of Stephen!");
        System.out.println("Are you an existing customer? (-1 to exit)");
        System.out.println("1. Yes");
        System.out.println("2. No");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 2:
                System.out.println("What is the name for the account?");
                this.holderName = scanner.nextLine();
                System.out.println("What is the beginning balance for the account?");
                this.balance = Double.parseDouble(scanner.nextLine());
                this.accountNumber = -1;
                break;
            case -1:
                break;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

//    Commented out this setter because logically you wouldn't want to be able to change the account name
//    public void setHolderName(String holderName) {
//        this.holderName = holderName;
//    }

    public void deposit(double amount) {
        setBalance(getBalance()+amount);
    }

    public void withdrawal(double amount) {
        if(getBalance() < amount) {
            System.out.println("Insufficient funds.");
        } else {
            setBalance(getBalance()-amount);
        }
    }

    public void transfer(BankAccounts otherAccount, double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance.");
        }

        // Withdraw from this account
        withdrawal(amount);

        // Deposit into the other account
        otherAccount.deposit(amount);

        details();
        otherAccount.details();
    }

    public void details() {
        System.out.printf("%s's account balance: %s\n", getHolderName(), getBalance());
    }
}


