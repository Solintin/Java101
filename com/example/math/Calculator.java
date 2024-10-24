package com.example.math;

public class Calculator {
    public int add(int a, int b) {
        int result = a + b;
        System.out.println(String.format("%s + %s = %s", a, b, result));
        return result;
    }

    public int subtract(int bigNo, int smallNo) {
        int result = bigNo - smallNo;
        System.out.println(String.format("%s - %s = %s", bigNo, smallNo, result));

        return result;
    }

    public int divide(int bigNo, int smallNo) {
        int result = bigNo / smallNo;
        System.out.println(String.format("%s / %s = %s", bigNo, smallNo, result));

        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        System.out.println(String.format("%s * %s = %s", a, b, result));

        return result;
    }
}
