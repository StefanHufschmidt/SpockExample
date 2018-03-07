package de.gdata.spockexsample;

/**
 * The calculator unit is able to calculate totals of orders.
 */
class CalculatorUnit {

    /**
     * Calculates the total price of all items which have been ordered.
     *
     * @param orderItems the items which have been ordered
     * @return the total price
     */
    double calculate(OrderItem ... orderItems) {
        if(orderItems == null || orderItems.length == 0){
            throw new IllegalArgumentException("You have to calculate with at least one item.");
        }
        double rersult = 0.0;
        for (OrderItem item : orderItems){
            rersult += calculateTotalOfItem(item);
        }
        return rersult;
    }

    /**
     * Calculates the total of an OrderItem.
     *
     * @param item the item to calculate total from
     * @return the total
     */
    private double calculateTotalOfItem(OrderItem item) {
        return item.getAmount() * item.getPrice();
    }
}
