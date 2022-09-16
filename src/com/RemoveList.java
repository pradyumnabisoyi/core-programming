package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RemoveList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99);
        Set<Integer> set = Set.of(2,4,7,44,23,56,11,99,65,55);

        List<Integer> l = new ArrayList<>(list);
        //l.remove(0);
        remove(l, set);
        System.out.println(list);
        System.out.println(l);
    }

    private static void remove(List<Integer> list, Set<Integer> set) {
        //list.remove(0);
        for (int i = 0; i < list.size(); i++) {
            var k = list.get(i);
            for (var j : set) {
                if (j == k) {
                    list.remove(i --);
                }
            }
        }

    }
}
