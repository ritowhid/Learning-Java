package com.main.DSA.Algorithm.Linear_Search;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 78, 54, 575, 5, 52, 57};
        int target = 5;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++){
            // check for element at every index
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
