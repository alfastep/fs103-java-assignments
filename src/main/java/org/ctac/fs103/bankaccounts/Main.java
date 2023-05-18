package org.ctac.fs103.bankaccounts;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<BankAccounts> accountsList = new ArrayList<>();
        BankAccounts account1 = new BankAccounts(3000, "John", 1);
        accountsList.add(account1);
        BankAccounts account2 = new BankAccounts();
        account2.setAccountNumber(2);
        accountsList.add(account2);

        mainMenu(account2, accountsList);
    }
    public static void mainMenu(BankAccounts currentAccount, ArrayList<BankAccounts> accountList) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hello " + currentAccount.getHolderName());
            System.out.println("Welcome to the Main Menu, what would you like to do today ?");
            System.out.println("1. To check account balance");
            System.out.println("2. To make a withdrawal");
            System.out.println("3. To make a deposit");
            System.out.println("4. To make a transfer to another account");
            System.out.println("0. To exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    currentAccount.details();
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw?");
                    double withdrawalAmount = scanner.nextDouble();
                    currentAccount.withdrawal(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("How much would you like to deposit?");
                    double depositAmount = scanner.nextDouble();
                    currentAccount.deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("Please enter the account number to transfer to");
                    int transferAccountNumber = scanner.nextInt();
                    BankAccounts transferAccount = findAccount(transferAccountNumber, accountList);
                    if (transferAccount == null) {
                        System.out.println("Account doesn't exist");
                        break;
                    }
                    System.out.println("Please enter the amount to transfer");
                    double transferAmount = scanner.nextDouble();
                    currentAccount.transfer(transferAccount, transferAmount);
                    break;
                case 0:
                    System.out.println("Thank you for banking with us!");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    public static BankAccounts findAccount(int accountNumber, ArrayList<BankAccounts> accountList) {
        for (BankAccounts account : accountList) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
