package de.gdata.spockexsample;

class OrderItem {

    private double price;
    private int amount;

    OrderItem(double price, int amount) {
        this.price = price;
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

}
