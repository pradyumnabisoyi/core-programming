package com.recursion;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("java"));
    }

    private static String reverse(String str) {
        if (str.isEmpty())
            return str;
        return reverse(str.substring(1)) + str.charAt(0) ;
    }


    private static String reverse2(String str) {
        int l = str.length();
        if (l <= 1)
            return str;
        return str.charAt(l - 1) + reverse2(str.substring(0, l - 1));
    }
}
