package arrays.largestNumber;

import java.util.*;

public class largest_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = findLargest(arr,n);
        System.out.println("Largest number in the array is: "+ ans);
    }
    //function to find the largest number
    private static int findLargest(int[] arr, int n) {
        /**
         * iterative method
         * Time complexity: O(n)
         */
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;

        /**
         * using sorting techinque
         * Time complexity: O(nlogn)
         */
        // Arrays.sort(arr);
        // return arr[n-1];

    }
    
}
