package com.main.dsa.algorithm.linear_search;

public class FindMin {
    public static void main(String[] args) {
        int[] arr ={2, 78, 54, 575, 5, 52, 57};
        System.out.println(min(arr));
    }

    // assume arr.length !=0
    // return the minimum value in the array
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] <  ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
