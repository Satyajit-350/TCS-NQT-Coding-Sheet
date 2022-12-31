package arrays.subarray;

import java.util.*;

public class max_sum_subarray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = maxSumSubarray(arr,n);
        System.out.println("Maximum sum is: "+ ans);
    }

    private static int maxSumSubarray(int[] arr, int n) {

        /**
         * we can do this by using two loops but 
         * Time complexity will be O(n^2)
         */

        /**
         * The best approach is by using Kadane's Algorithim (Optimized approach)
         * Time complexity: O(n)
         */
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            sum += arr[i];
            max = Math.max(sum, max);
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}
