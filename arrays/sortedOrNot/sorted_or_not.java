package arrays.sortedOrNot;

import java.io.*;

public class sorted_or_not {
    public static void main(String[] args)  throws Exception{
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;
        int n = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[n];
        inputLine = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputLine[i]);
        }
        boolean ans = arraySortedOrNot(arr, n);
        System.out.println(ans ? 1 : 0);
    }

    private static boolean arraySortedOrNot(int[] arr, int n) {
        /**
         * Time complexity: O(n)
         * Do try this question also: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
         */
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                return false; 
            }
        }
        return true;

    }
}


