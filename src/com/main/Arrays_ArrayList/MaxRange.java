package com.main.Arrays_ArrayList;

public class MaxRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 45, 79, 9};
        System.out.println(maxRange(arr, 1, 5));
    }

    static int  maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for (int i = start; i <= end; i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
