package com.main.Arrays_ArrayList;

import java.util.Arrays;

public class PassingMethod {
    public static void main(String[] args){
        int[] nums = {1, 5, 6, 7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
