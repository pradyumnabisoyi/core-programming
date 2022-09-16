package com.recursion;

public class RecursiveRange {
    public static void main(String[] args) {
        System.out.println(recursiveRange(5));
    }

    private static Integer recursiveRange(int i) {
        if (i <= 0 )
            return 0;
        return i + recursiveRange(--i);
    }
}
