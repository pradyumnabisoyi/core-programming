package com.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(4));
    }

    private static Integer factorial(int num) {
        if (num <= 0)
            return 1;
        return num * factorial(--num);
    }
}
