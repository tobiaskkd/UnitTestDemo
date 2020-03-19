package com.company;

public class DemoApp {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int getHighest(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}
