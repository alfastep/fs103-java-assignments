package org.ctac.fs103.classobjectconstructor;

public class BankAccount {
    private double balance;
    private final String holderName;

    public BankAccount(double balance, String holderName) {
        this.balance = balance;
        this.holderName = holderName;
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

    public void details() {
        System.out.printf("%s's account balance: %s\n", getHolderName(), getBalance());
    }
}


