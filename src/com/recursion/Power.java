package com.recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2,0));
        System.out.println(power(2,2));
        System.out.println(power(2,4));
    }

    private static Integer power(int base, int exponent) {
        if (exponent <= 0)
            return 1;
        return base * power(base, --exponent);
    }
}
