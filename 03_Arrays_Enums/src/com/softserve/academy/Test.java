package com.softserve.academy;

public class Test {
    public static void main(String[] args) {
        int[] arr = {2, -5, 7, -4, 8};
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
            for (int elem : arr) System.out.print(elem + " ");
    }
}