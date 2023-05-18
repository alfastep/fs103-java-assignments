package org.ctac.fs103.classobjectconstructor;

public class Main {
    public static void main(String[] args) {
//      Bank Account Assignment
        System.out.println("BANK ACCOUNT ASSIGNMENT");
        BankAccount account = new BankAccount(500.0, "Stephen");
        account.deposit(100.0);
        account.details();
        System.out.println();

//      Bank Transfer Assignment
        System.out.println("BANK TRANSFER ASSIGNMENT");
        BankAccount account2 = new BankAccount(5000.0, "Jane");
        BankAccount account3 = new BankAccount(300.0, "Lane");

        account2.withdrawal(100.0);
        account3.deposit(100.0);

        account2.details();
        account3.details();
        System.out.println();

//       Product Assignment
        System.out.println("PRODUCT ASSIGNMENT");
        Product product = new Product(1.50, 4, "Skittles");
        product.printProduct();
        product.totalCost();
    }
}
