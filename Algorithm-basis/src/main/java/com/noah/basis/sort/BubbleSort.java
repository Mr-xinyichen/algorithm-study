package com.noah.basis.sort;

import java.util.Arrays;

/**
 * @author noah
 * @date 2023-01-26 21:03:37
 * @description BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        proceed(new int[]{3,8,7,4,2,1,0,5,6});
    }

    public static void proceed(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
               if (arr[i]>arr[j]){
                   swap(arr,i,j);
               }
            }
        }
        print(arr);
    }

    /**
     * print array
     * @param arr
     */
    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    /**
     * swap index of element
     * @param arr origin array
     * @param a index a
     * @param b index b
     */
    private static void swap(int[] arr, int a, int b) {
        int tem = arr[a];
        arr[a] = arr[b];
        arr[b] = tem;
    }
}
