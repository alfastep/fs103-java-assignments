package org.ctac.fs103.classobjectconstructor;

public class Product {
    private double cost;
    private int quantity;
    private String name;

    public Product(double cost, int quantity, String name) {
        this.cost = cost;
        this.quantity = quantity;
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void totalCost() {
        System.out.printf("Total cost is %s\n", (getCost() * getQuantity()));
    }

    public void printProduct() {
        System.out.printf("One unit of %s costs %s. %s units were purchased\n", getName(), getCost(), getQuantity());
    }
}
