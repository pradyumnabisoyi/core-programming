package com.recursion;

public class ProductionOfArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(productofArray(arr, arr.length));
    }

    private static Integer productofArray(int[] arr, int l) {
        if (l < 0 || l > arr.length)
            return 1;
        else if(l == 0)
            return arr[0];
        return arr[--l] * productofArray(arr, l);
    }
}
