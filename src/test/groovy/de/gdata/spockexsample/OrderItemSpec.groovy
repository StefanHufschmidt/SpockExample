package de.gdata.spockexsample

import spock.lang.Specification
import spock.lang.Unroll

class OrderItemSpec extends Specification {

    def "Check constructor" () {
        given: "A price"
        double price = 30.0d

        and: "An amount"
        int amount = 3

        when: "initialize"
        OrderItem orderItem = new OrderItem(price, amount)

        then: "object is not null and values have been set"
        orderItem != null
        orderItem.price == price
        orderItem.amount == amount
    }

    def "Check getPrice" () {
        given: "An instance with values set"
        OrderItem orderItem = new OrderItem(30.0d, 3)

        expect: "getPrice returns price which has been set"
        orderItem.getPrice() == 30.0d
    }

    @Unroll
    def "Check getAmount with amount: '#amount'" () {
        given: "An instance with values set"
        OrderItem orderItem = new OrderItem(30.0d, amount)

        expect: "getAmount returns specific amount"
        orderItem.getAmount() == amount

        where:
        amount << [1, 2, 3, 0]
    }

    @Unroll
    def "Check getAmount and getPrice for amount: '#amount' and price: '#price'" () {
        given: "An instance with values set"
        OrderItem orderItem = new OrderItem(price, amount)

        expect: "getAmount returns specific amount and getPrice returns specific price"
        orderItem.getAmount() == amount
        orderItem.getPrice() == price

        where:
        amount | price
        1      | 30.0d
        2      | 15.0d
    }
}
