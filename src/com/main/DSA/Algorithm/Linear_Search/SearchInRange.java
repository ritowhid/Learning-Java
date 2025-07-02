package com.main.DSA.Algorithm.Linear_Search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2, 78, 54, 575, 5, 52, 57};
        int target = 57;
        System.out.println(linearSearch(arr, target, 1, 4));
    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = start; index <= end; index++){
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
