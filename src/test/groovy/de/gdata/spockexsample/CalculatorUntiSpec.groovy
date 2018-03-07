package de.gdata.spockexsample

import spock.lang.Specification

class CalculatorUntiSpec extends Specification {

    def "Check calculate throws exception when no arguments" () {
        given: "A CalculatorUnit"
        CalculatorUnit calculatorUnit = new CalculatorUnit()

        when: "calling calculate"
        calculatorUnit.calculate()

        then: "IllegalArgumentException has been thrown"
        thrown(IllegalArgumentException.class)
    }

    def "Check calculate throws exception when empty array as arguments" () {
        given: "A CalculatorUnit"
        CalculatorUnit calculatorUnit = new CalculatorUnit()

        when: "calling calculate"
        calculatorUnit.calculate(new OrderItem[0])

        then: "IllegalArgumentException has been thrown"
        thrown(IllegalArgumentException.class)
    }

    def "Check calculate with two OrderItems" () {
        given: "two OrderItems"
        OrderItem item1 = new OrderItem(10.5d, 2)
        OrderItem item2 = new OrderItem(5.0d, 3)

        and: "A CalculatorUnit"
        CalculatorUnit calculatorUnit = new CalculatorUnit()

        expect: "result of calculate matches"
        calculatorUnit.calculate(item1, item2) == 36.0d
    }

    def "Check calculateTotalOfItem" () {
        given: "An OrderItem"
        OrderItem item = new OrderItem(10.0d, 3)

        and: "A CalculatorUnit"
        CalculatorUnit calculatorUnit = new CalculatorUnit()

        expect: "calculateTotalOfItem with item returns correct result"
        calculatorUnit.calculateTotalOfItem(item) == 30.0d
    }

}
