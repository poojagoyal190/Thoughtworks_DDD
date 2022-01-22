package org.example;

public class Item {
    private String productName;
    private int quantity;
    Item(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }
    public String toString() {
        String s = this.productName + ":";
        s = s + this.quantity + "\n";
        return s;
    }
    public String getProductName() {
        return this.productName;
    }
    public int getQuantity() {
        return this.quantity;
    }

}
