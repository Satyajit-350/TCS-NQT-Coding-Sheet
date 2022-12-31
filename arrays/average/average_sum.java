package arrays.average;

import java.util.*;

public class average_sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        float ans = findAverage(arr,n);
        System.out.println("Average sum of the array is: "+ ans);
    }

    private static float findAverage(int[] arr, int n) {
        /**
         * iterative method
         * Time complexity: O(n)
         */
        int sum = 0;
        for(int e: arr){
            sum += e;
        }
        float ans = (float)sum/n;
        return ans;
    }
    
}
