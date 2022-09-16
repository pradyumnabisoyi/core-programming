package com.recursion;

public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    private static Integer fib(int i) {
        if (i < 0 )
            return -1;
        else if ( i == 0 || i == 1)
            return  i;

        return fib(i - 1) + fib(i - 2);
    }
}
