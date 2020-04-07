package com.example.calculator;

public class Calculator {

    private double result;


    public double addition(double n1, double n2) {
        this.result = n1 + n2;
        return result;
    }

    public double multiplication(double n1, double n2) {
        this.result = n1 * n2;
        return result;
    }

    public double division(double n1, double n2) {
        if (n2 == 0)
            throw new ArithmeticException("Cannot divide by zero");
        else {
            this.result = n1 / n2;
            return result;
        }
    }


    public double subtraction(double n1, double n2) {
        this.result = n1 - n2;
        return result;
    }


    public double modulus(double n1) {
        return n1 /100;
    }

}