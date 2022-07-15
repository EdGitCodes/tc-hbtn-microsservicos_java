package com.example.calculator.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Calculator {

    public Calculator() {
    }

    public Double sub(Double number1, Double number2) {
        Double subtra=number1-number2;
        if(number1.equals("") || number1 == null  || number2.equals("") || number2 == null){
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
        return subtra;
    }

    public Double sum(Double number1, Double number2) {
        Double soma = number1 + number2;

        if(number1.equals("") || number1 == null  || number2.equals("") || number2 == null){
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
        return soma;
    }

    public Double divide (Double number1, Double number2)  {

        Double div = number1/number2;

        if(number1.equals("") || number1 == null  || number2.equals("") || number2 == null){
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        } else if (number1 == 0 || number2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitido.");
        }
        return div;
    }

    public Integer factorial(Integer factorial) {

        if(factorial.equals("") || factorial == null){
            throw new NullPointerException("Número é obrigatório.");
        } else if (factorial == 0) {
            return 1;
        }
        return (factorial*factorial(factorial-1));
    }

    public static Integer integerToBinary(Integer integer) {
        return Integer.parseInt(Integer.toBinaryString(integer));
    }

    public String integerToHexadecimal(Integer integer) {
        return Integer.toHexString(integer);
    }

    public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {
        return (int) ChronoUnit.DAYS.between(date1, date2);
    }

}