package com.example.calculator.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    void sumTest() {
        assertEquals(5.0,calculator.sum(3.0,2.0));
    }

    @Test
    public void numbersNullSumTest() {
        Assertions.assertThrows(NullPointerException.class, () -> calculator.sum(null,1.00),"Número 1 e número 2 são obrigatórios.");
    }

    @Test
    void subTest() {
        assertEquals(0.0,calculator.sub(1.0,1.0));
    }

    @Test
    void divideTest() {
        assertEquals(3.0,calculator.divide(6.0,2.0));
    }

    @Test
    public void divisionByZeroTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(5.0, 0.0), "Divisão por zero não é permitido.");
    }

    @Test
    void factorialTest() {
        assertEquals(720,calculator.factorial(6));
    }

    @Test
    void integerToBinaryTest() {
        assertEquals(10,calculator.integerToBinary(2));
    }

    @Test
    void integerToHexadecimalTest() {
        assertEquals("14",calculator.integerToHexadecimal(20));
    }

    @Test
    void calculeDayBetweenDateTest() {
        LocalDate date1 = LocalDate.of(2022,03,06);
        LocalDate date2 = LocalDate.of(2022,03,10);
        assertEquals(4,calculator.calculeDayBetweenDate(date1,date2));
    }

}