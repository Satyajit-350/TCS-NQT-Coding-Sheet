package arrays.subarray;

import java.util.*;

public class max_product_subarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = maxProductSubarray(arr,n);
        System.out.println("Maximum product is: "+ ans);
    }

    private static int maxProductSubarray(int[] arr, int n) {
        /**
         * The best approach is by using Kadane's Algorithim (Optimized approach)
         * Time complexity: O(n)
         */
        int max = Integer.MIN_VALUE;
        int prod = 1;
        for(int i=0; i<n; i++){
            prod *= arr[i];
            max = Math.max(prod, max);
            if(prod == 0){
                prod = 1;
            }
        }
        return max;
    }
}
