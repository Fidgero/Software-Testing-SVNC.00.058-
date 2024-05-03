package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Float.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    @DisplayName("Addition of 2 numbers")
    public void Addition(){
        Calculator myCalculator = new Calculator();
        assertEquals(15, myCalculator.plus(9, 6));
    }

    @Test
    @DisplayName("Subtraction of 2 numbers")
    public void Subtraction(){
        Calculator myCalculator = new Calculator();
        assertEquals(9, myCalculator.minus(6, -3));
    }

    @Test
    @DisplayName("Multiplication of 2 numbers")
    public void Multiplication(){
        Calculator myCalculator = new Calculator();
        assertEquals(9, myCalculator.multiply(2.25F, 4));
    }

    @Test
    @DisplayName("Division of 2 numbers")
    public void Division(){
        Calculator myCalculator = new Calculator();
        assertEquals(2.5, myCalculator.division(10, 4));
    }

    @Test
    @DisplayName("Division by zero")
    public void DivisionByZero(){
        Calculator myCalculator = new Calculator();
        assertEquals(NaN, myCalculator.division(10, 0));
    }

    @Test
    @DisplayName("Power of a number")
    public void PowerOfANumber(){
        Calculator myCalculator = new Calculator();
        assertEquals(729, myCalculator.power(3, 6));
    }

    @Test
    @DisplayName("Square root of a number")
    public void SquareRoot(){
        Calculator myCalculator = new Calculator();
        assertEquals(11, myCalculator.root(121));
    }
}
