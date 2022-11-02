package com.functional;

import java.util.function.*;

public class FunctionImpl {
    public static void main(String[] args) {
        Function<Long, Long> f1 = (t) -> t + 20;
        Function<Long, String> f2 = (t) -> "Hello " + t;

        System.out.println(f1.apply(23L));
        System.out.println(f2.apply(23L));
        System.out.println("=============================");

        Predicate<Long> p1 = (t) -> t != null;
        Predicate<Long> p2 = (t) -> t > 10;
        System.out.println(p1.test(23L));
        System.out.println(p2.test(23L));
        System.out.println(p2.test(2L));
        System.out.println("=============================");

        UnaryOperator<Long> u = (t) -> t + 9;
        System.out.println(u.apply(2l));
        System.out.println("=============================");

        BinaryOperator<Long> b = (t, s) -> t + s;
        System.out.println(b.apply(2l, 3l));
        System.out.println("=============================");

        Supplier<Integer> s1 = () -> (int) (Math.random() * 1000);
        System.out.println(s1.get());
        System.out.println(s1.get());
        System.out.println(s1.get());
        System.out.println("=============================");

        Consumer<Integer> c1 = (t) -> System.out.println(t);
        c1.accept(3);
    }

}
