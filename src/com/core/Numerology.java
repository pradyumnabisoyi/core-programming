package com.core;

import java.util.Locale;
import java.util.Scanner;

public class Numerology {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "??";
        do {
            System.out.print("Enter your name or number : ");
            name = sc.nextLine().trim().replace(" ", "").toUpperCase();
            printValue(name);
        } while (name.contains("??") != true);

    }

    public static void printValue(String name) {
        int count = 0;
        for (char c : name.toCharArray()) {
            int v = getValue(c);
            System.out.print(c + "=" + v + ", ");
            count += v;
        }
        System.out.println(count);
        int total = count % 9;
        if (total == 0 && count > 0) {
            total += 9;
        }
        System.out.println(total);
    }

    public static int getValue(char ch) {
        switch (ch) {
            case 'A': case 'I': case 'J': case 'Q': case 'Y':  case '1':
                return 1;
            case 'B': case 'K': case 'R':  case '2':
                return 2;
            case 'C': case 'G': case 'L': case 'S':  case '3':
                return 3;
            case 'D': case 'M': case 'T':  case '4':
                return 4;
            case 'E': case 'H': case 'N': case 'X':  case '5':
                return 5;
            case 'U': case 'V': case 'W':  case '6':
                return 6;
            case 'O': case 'Z':  case '7':
                return 7;
            case 'F': case 'P': case '8':
                return 8;
            case '9':
                return 9;
        }
        return 0;
    }
}
