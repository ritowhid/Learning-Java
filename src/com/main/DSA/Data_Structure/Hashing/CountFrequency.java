package com.main.DSA.Data_Structure.Hashing;

public class CountFrequency {
    public static void main(String[] args) {
        int arr[] ={10,5,10,15,10,5};
        int n = arr.length;
        CountFrequency(arr, n);
    }

    public static void CountFrequency(int arr[], int n) {
        boolean visited[] = new boolean[n];

        for (int i=0; i<n; i++) {
            // skip this element if already processed
            if (visited[i] == true)
                continue;

            // count frequency
            int count = 1;
            for (int j = i+1; j<n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " +  count);
        }
    }
}
