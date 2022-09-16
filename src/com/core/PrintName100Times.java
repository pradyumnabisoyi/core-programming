package com.core;

public class PrintName100Times {
    public static void main(String[] args) {
        String s = "Your name";
        int count = 100;
        //printUsingForLoop(s, count);
        //printUsingWhileLoop(s, count);
        printUsingDoWhileLoop(s, count);
        //printNameUsingRecursion(s, count);
    }

    //Using for loop
    private static void printUsingForLoop(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    //Using while loop
    private static void printUsingWhileLoop(String s, int n) {
        int i = 0;
        while(i < n) {
            System.out.println(s);
            i ++;
        }
    }

    //Using do .. while loop
    private static void printUsingDoWhileLoop(String s, int n) {
        int i = 0;
        do {
            System.out.println(s);
            i ++;
        } while(i < n);
    }

    private static void printNameUsingRecursion (String s, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(s);
        printNameUsingRecursion(s, n - 1);
    }
}
