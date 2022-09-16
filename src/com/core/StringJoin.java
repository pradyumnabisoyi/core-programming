package com.core;

public class StringJoin {
    public static void main(String[] args) {
        String result = "I " + "am" + "a" + "Java" + "lover.";
        System.out.println(result);
        result = new StringBuffer("I ").append( "am").
                append("a").append("Java").append("lover.").toString();
        System.out.println(result);
        result = new StringBuilder("I ").append( "am").
                append("a").append("Java").append("lover.").toString();
        System.out.println(result);
    }

    public static void main2(String[] args) {
        String result = String.join(", ", "I ", "am", "a", "Java" , "lover.");
        System.out.println(result);
        result = String.join(" ", "I ", "am", "a", "Java" , "lover.");
        System.out.println(result);
    }
}
