package com.noah.basis.sort;

import java.util.Arrays;


/**
 * @author noah
 * @date 2023-01-26 20:13:46
 * @description SelectorSort
 */
public class SelectSort {

    public static void main(String[] args) {
        proceed(new int[]{3,8,7,4,2,1,0,5,6});
    }

    /**
     * SelectorSort
     * @param arr origin
     */
    public static void proceed(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr,minIndex,i);
        }
        print(arr);
    }

    /**
     * exchange element
     * @param arr array
     * @param index1 index a
     * @param index2 index b
     */
    public static void swap(int[] arr,int index1, int index2){
        int tem = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tem;
    }

    /**
     * print array
     * @param arr orgin array
     */
    public static void print(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

}
